package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (main) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4a.example.dateutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _clearbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _delbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _dividebtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _timesbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _minusbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _plusbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _percentbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _periodbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _plusminusbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _eightbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _equalbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _fivebtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _fourbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _ninebtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _onebtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _sevenbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _sixbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _threebtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _twobtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _zerobtn = null;
public static float _operand1 = 0f;
public static float _operand2 = 0f;
public static boolean _addition = false;
public static boolean _subtraction = false;
public static boolean _multiplication = false;
public static boolean _division = false;
public static boolean _hasop = false;
public b4a.example.dateutils _dateutils = null;
public b4a.example.starter _starter = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Activity.LoadLayout(\"Layout\")";
mostCurrent._activity.LoadLayout("Layout",mostCurrent.activityBA);
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="End Sub";
return "";
}
public static String  _btn_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _button = null;
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Private Sub btn_Click";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Dim button As Button = Sender";
_button = new anywheresoftware.b4a.objects.ButtonWrapper();
_button = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="If button.Tag = \"0\" Or button.Tag = \"1\" Or button";
if ((_button.getTag()).equals((Object)("0")) || (_button.getTag()).equals((Object)("1")) || (_button.getTag()).equals((Object)("2")) || (_button.getTag()).equals((Object)("3")) || (_button.getTag()).equals((Object)("4")) || (_button.getTag()).equals((Object)("5")) || (_button.getTag()).equals((Object)("6")) || (_button.getTag()).equals((Object)("7")) || (_button.getTag()).equals((Object)("8")) || (_button.getTag()).equals((Object)("9"))) { 
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="If hasOp = True Then";
if (_hasop==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="EditText1.Text = \"\"";
mostCurrent._edittext1.setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=196616;
 //BA.debugLineNum = 196616;BA.debugLine="If EditText1.Text = \"\" Then";
if ((mostCurrent._edittext1.getText()).equals("")) { 
RDebugUtils.currentLine=196617;
 //BA.debugLineNum = 196617;BA.debugLine="hasOp = false";
_hasop = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=196618;
 //BA.debugLineNum = 196618;BA.debugLine="EditText1.Text = button.Tag";
mostCurrent._edittext1.setText(BA.ObjectToCharSequence(_button.getTag()));
 }else {
RDebugUtils.currentLine=196620;
 //BA.debugLineNum = 196620;BA.debugLine="EditText1.Text = EditText1.Text & button.Tag";
mostCurrent._edittext1.setText(BA.ObjectToCharSequence(mostCurrent._edittext1.getText()+BA.ObjectToString(_button.getTag())));
 };
 }else 
{RDebugUtils.currentLine=196623;
 //BA.debugLineNum = 196623;BA.debugLine="Else If button.Tag = \"+\" Or button.Tag = \"-\" Or b";
if ((_button.getTag()).equals((Object)("+")) || (_button.getTag()).equals((Object)("-")) || (_button.getTag()).equals((Object)("*")) || (_button.getTag()).equals((Object)("/"))) { 
RDebugUtils.currentLine=196624;
 //BA.debugLineNum = 196624;BA.debugLine="hasOp = True";
_hasop = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=196626;
 //BA.debugLineNum = 196626;BA.debugLine="If button.Tag = \"+\" Then";
if ((_button.getTag()).equals((Object)("+"))) { 
RDebugUtils.currentLine=196627;
 //BA.debugLineNum = 196627;BA.debugLine="If EditText1.Text = \"\" Then";
if ((mostCurrent._edittext1.getText()).equals("")) { 
RDebugUtils.currentLine=196628;
 //BA.debugLineNum = 196628;BA.debugLine="EditText1.Text = \"+\"";
mostCurrent._edittext1.setText(BA.ObjectToCharSequence("+"));
 }else {
RDebugUtils.currentLine=196630;
 //BA.debugLineNum = 196630;BA.debugLine="operand1 = EditText1.Text";
_operand1 = (float)(Double.parseDouble(mostCurrent._edittext1.getText()));
RDebugUtils.currentLine=196631;
 //BA.debugLineNum = 196631;BA.debugLine="addition = True";
_addition = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=196632;
 //BA.debugLineNum = 196632;BA.debugLine="EditText1.Text = \"+\"";
mostCurrent._edittext1.setText(BA.ObjectToCharSequence("+"));
 };
 }else 
{RDebugUtils.currentLine=196635;
 //BA.debugLineNum = 196635;BA.debugLine="Else If button.Tag = \"-\" Then";
if ((_button.getTag()).equals((Object)("-"))) { 
RDebugUtils.currentLine=196636;
 //BA.debugLineNum = 196636;BA.debugLine="If EditText1.Text = \"\" Then";
if ((mostCurrent._edittext1.getText()).equals("")) { 
RDebugUtils.currentLine=196637;
 //BA.debugLineNum = 196637;BA.debugLine="EditText1.Text = \"-\"";
mostCurrent._edittext1.setText(BA.ObjectToCharSequence("-"));
 }else {
RDebugUtils.currentLine=196639;
 //BA.debugLineNum = 196639;BA.debugLine="operand1 = EditText1.Text";
_operand1 = (float)(Double.parseDouble(mostCurrent._edittext1.getText()));
RDebugUtils.currentLine=196640;
 //BA.debugLineNum = 196640;BA.debugLine="subtraction = True";
_subtraction = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=196641;
 //BA.debugLineNum = 196641;BA.debugLine="EditText1.Text = \"-\"";
mostCurrent._edittext1.setText(BA.ObjectToCharSequence("-"));
 };
 }else 
{RDebugUtils.currentLine=196644;
 //BA.debugLineNum = 196644;BA.debugLine="Else If button.Tag = \"*\" Then";
if ((_button.getTag()).equals((Object)("*"))) { 
RDebugUtils.currentLine=196645;
 //BA.debugLineNum = 196645;BA.debugLine="If EditText1.Text = \"\" Then";
if ((mostCurrent._edittext1.getText()).equals("")) { 
RDebugUtils.currentLine=196646;
 //BA.debugLineNum = 196646;BA.debugLine="EditText1.Text = \"*\"";
mostCurrent._edittext1.setText(BA.ObjectToCharSequence("*"));
 }else {
RDebugUtils.currentLine=196648;
 //BA.debugLineNum = 196648;BA.debugLine="operand1 = EditText1.Text";
_operand1 = (float)(Double.parseDouble(mostCurrent._edittext1.getText()));
RDebugUtils.currentLine=196649;
 //BA.debugLineNum = 196649;BA.debugLine="multiplication = True";
_multiplication = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=196650;
 //BA.debugLineNum = 196650;BA.debugLine="EditText1.Text = \"*\"";
mostCurrent._edittext1.setText(BA.ObjectToCharSequence("*"));
 };
 }else 
{RDebugUtils.currentLine=196653;
 //BA.debugLineNum = 196653;BA.debugLine="Else If button.Tag = \"/\" Then";
if ((_button.getTag()).equals((Object)("/"))) { 
RDebugUtils.currentLine=196654;
 //BA.debugLineNum = 196654;BA.debugLine="If EditText1.Text = \"\" Then";
if ((mostCurrent._edittext1.getText()).equals("")) { 
RDebugUtils.currentLine=196655;
 //BA.debugLineNum = 196655;BA.debugLine="EditText1.Text = \"/\"";
mostCurrent._edittext1.setText(BA.ObjectToCharSequence("/"));
 }else {
RDebugUtils.currentLine=196657;
 //BA.debugLineNum = 196657;BA.debugLine="operand1 = EditText1.Text";
_operand1 = (float)(Double.parseDouble(mostCurrent._edittext1.getText()));
RDebugUtils.currentLine=196658;
 //BA.debugLineNum = 196658;BA.debugLine="division = True";
_division = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=196659;
 //BA.debugLineNum = 196659;BA.debugLine="EditText1.Text = \"/\"";
mostCurrent._edittext1.setText(BA.ObjectToCharSequence("/"));
 };
 }}}}
;
 }else 
{RDebugUtils.currentLine=196663;
 //BA.debugLineNum = 196663;BA.debugLine="Else If button.Tag = \"=\" Then";
if ((_button.getTag()).equals((Object)("="))) { 
RDebugUtils.currentLine=196664;
 //BA.debugLineNum = 196664;BA.debugLine="operand2 = EditText1.Text";
_operand2 = (float)(Double.parseDouble(mostCurrent._edittext1.getText()));
RDebugUtils.currentLine=196666;
 //BA.debugLineNum = 196666;BA.debugLine="If addition = True Then";
if (_addition==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=196667;
 //BA.debugLineNum = 196667;BA.debugLine="EditText1.Text = operand1 + operand2";
mostCurrent._edittext1.setText(BA.ObjectToCharSequence(_operand1+_operand2));
RDebugUtils.currentLine=196668;
 //BA.debugLineNum = 196668;BA.debugLine="addition = False";
_addition = anywheresoftware.b4a.keywords.Common.False;
 }else 
{RDebugUtils.currentLine=196669;
 //BA.debugLineNum = 196669;BA.debugLine="Else If subtraction = True Then";
if (_subtraction==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=196670;
 //BA.debugLineNum = 196670;BA.debugLine="EditText1.Text = operand1 - operand2";
mostCurrent._edittext1.setText(BA.ObjectToCharSequence(_operand1-_operand2));
RDebugUtils.currentLine=196671;
 //BA.debugLineNum = 196671;BA.debugLine="subtraction = False";
_subtraction = anywheresoftware.b4a.keywords.Common.False;
 }else 
{RDebugUtils.currentLine=196672;
 //BA.debugLineNum = 196672;BA.debugLine="Else If multiplication = True Then";
if (_multiplication==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=196673;
 //BA.debugLineNum = 196673;BA.debugLine="EditText1.Text = operand1 * operand2";
mostCurrent._edittext1.setText(BA.ObjectToCharSequence(_operand1*_operand2));
RDebugUtils.currentLine=196674;
 //BA.debugLineNum = 196674;BA.debugLine="multiplication = False";
_multiplication = anywheresoftware.b4a.keywords.Common.False;
 }else 
{RDebugUtils.currentLine=196675;
 //BA.debugLineNum = 196675;BA.debugLine="Else If division = True Then";
if (_division==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=196676;
 //BA.debugLineNum = 196676;BA.debugLine="EditText1.Text = operand1 / operand2";
mostCurrent._edittext1.setText(BA.ObjectToCharSequence(_operand1/(double)_operand2));
RDebugUtils.currentLine=196677;
 //BA.debugLineNum = 196677;BA.debugLine="division = False";
_division = anywheresoftware.b4a.keywords.Common.False;
 }}}}
;
RDebugUtils.currentLine=196680;
 //BA.debugLineNum = 196680;BA.debugLine="operand1 = 0";
_operand1 = (float) (0);
RDebugUtils.currentLine=196681;
 //BA.debugLineNum = 196681;BA.debugLine="operand2 = 0";
_operand2 = (float) (0);
RDebugUtils.currentLine=196682;
 //BA.debugLineNum = 196682;BA.debugLine="hasOp = False";
_hasop = anywheresoftware.b4a.keywords.Common.False;
 }else 
{RDebugUtils.currentLine=196684;
 //BA.debugLineNum = 196684;BA.debugLine="Else If button.Tag = \"clear\" Then";
if ((_button.getTag()).equals((Object)("clear"))) { 
RDebugUtils.currentLine=196685;
 //BA.debugLineNum = 196685;BA.debugLine="EditText1.Text = \"\"";
mostCurrent._edittext1.setText(BA.ObjectToCharSequence(""));
 }}}}
;
RDebugUtils.currentLine=196689;
 //BA.debugLineNum = 196689;BA.debugLine="End Sub";
return "";
}
}