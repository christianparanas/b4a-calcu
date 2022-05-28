package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_2 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,54);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 54;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(4194304);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_click() throws Exception{
try {
		Debug.PushSubsStack("btn_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,59);
if (RapidSub.canDelegate("btn_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btn_click");}
RemoteObject _button = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
 BA.debugLineNum = 59;BA.debugLine="Private Sub btn_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="Dim button As Button = Sender";
Debug.ShouldStop(134217728);
_button = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_button = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), main.mostCurrent.__c.runMethod(false,"Sender",main.mostCurrent.activityBA));Debug.locals.put("button", _button);Debug.locals.put("button", _button);
 BA.debugLineNum = 62;BA.debugLine="If button.Tag = \"0\" Or button.Tag = \"1\" Or button";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("0"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("1"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("2"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("3"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("4"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("5"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("6"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("7"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("8"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("9")))) { 
 BA.debugLineNum = 63;BA.debugLine="If hasOp = True Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",main._hasop,main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 64;BA.debugLine="EditText1.Text = \"\"";
Debug.ShouldStop(-2147483648);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 };
 BA.debugLineNum = 67;BA.debugLine="If EditText1.Text = \"\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",main.mostCurrent._edittext1.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 68;BA.debugLine="hasOp = False";
Debug.ShouldStop(8);
main._hasop = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 69;BA.debugLine="EditText1.Text = button.Tag";
Debug.ShouldStop(16);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_button.runMethod(false,"getTag")));
 }else {
 BA.debugLineNum = 71;BA.debugLine="EditText1.Text = EditText1.Text & button.Tag";
Debug.ShouldStop(64);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._edittext1.runMethod(true,"getText"),_button.runMethod(false,"getTag"))));
 };
 }else 
{ BA.debugLineNum = 74;BA.debugLine="Else If button.Tag = \"+\" Or button.Tag = \"-\" Or b";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("+"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("-"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("*"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("/")))) { 
 BA.debugLineNum = 75;BA.debugLine="hasOp = True";
Debug.ShouldStop(1024);
main._hasop = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 77;BA.debugLine="If button.Tag = \"+\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("+")))) { 
 BA.debugLineNum = 78;BA.debugLine="If EditText1.Text = \"\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",main.mostCurrent._edittext1.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 79;BA.debugLine="EditText1.Text = \"+\"";
Debug.ShouldStop(16384);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("+"));
 }else {
 BA.debugLineNum = 81;BA.debugLine="operand1 = EditText1.Text";
Debug.ShouldStop(65536);
main._operand1 = BA.numberCast(float.class, main.mostCurrent._edittext1.runMethod(true,"getText"));
 BA.debugLineNum = 82;BA.debugLine="addition = True";
Debug.ShouldStop(131072);
main._addition = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 83;BA.debugLine="EditText1.Text = \"+\"";
Debug.ShouldStop(262144);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("+"));
 };
 }else 
{ BA.debugLineNum = 86;BA.debugLine="Else If button.Tag = \"-\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("-")))) { 
 BA.debugLineNum = 87;BA.debugLine="If EditText1.Text = \"\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",main.mostCurrent._edittext1.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 88;BA.debugLine="EditText1.Text = \"-\"";
Debug.ShouldStop(8388608);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("-"));
 }else {
 BA.debugLineNum = 90;BA.debugLine="operand1 = EditText1.Text";
Debug.ShouldStop(33554432);
main._operand1 = BA.numberCast(float.class, main.mostCurrent._edittext1.runMethod(true,"getText"));
 BA.debugLineNum = 91;BA.debugLine="subtraction = True";
Debug.ShouldStop(67108864);
main._subtraction = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 92;BA.debugLine="EditText1.Text = \"-\"";
Debug.ShouldStop(134217728);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("-"));
 };
 }else 
{ BA.debugLineNum = 95;BA.debugLine="Else If button.Tag = \"*\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("*")))) { 
 BA.debugLineNum = 96;BA.debugLine="If EditText1.Text = \"\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",main.mostCurrent._edittext1.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 97;BA.debugLine="EditText1.Text = \"*\"";
Debug.ShouldStop(1);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("*"));
 }else {
 BA.debugLineNum = 99;BA.debugLine="operand1 = EditText1.Text";
Debug.ShouldStop(4);
main._operand1 = BA.numberCast(float.class, main.mostCurrent._edittext1.runMethod(true,"getText"));
 BA.debugLineNum = 100;BA.debugLine="multiplication = True";
Debug.ShouldStop(8);
main._multiplication = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 101;BA.debugLine="EditText1.Text = \"*\"";
Debug.ShouldStop(16);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("*"));
 };
 }else 
{ BA.debugLineNum = 104;BA.debugLine="Else If button.Tag = \"/\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("/")))) { 
 BA.debugLineNum = 105;BA.debugLine="If EditText1.Text = \"\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",main.mostCurrent._edittext1.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 106;BA.debugLine="EditText1.Text = \"/\"";
Debug.ShouldStop(512);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("/"));
 }else {
 BA.debugLineNum = 108;BA.debugLine="operand1 = EditText1.Text";
Debug.ShouldStop(2048);
main._operand1 = BA.numberCast(float.class, main.mostCurrent._edittext1.runMethod(true,"getText"));
 BA.debugLineNum = 109;BA.debugLine="division = True";
Debug.ShouldStop(4096);
main._division = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 110;BA.debugLine="EditText1.Text = \"/\"";
Debug.ShouldStop(8192);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("/"));
 };
 }}}}
;
 }else 
{ BA.debugLineNum = 114;BA.debugLine="Else If button.Tag = \"=\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("=")))) { 
 BA.debugLineNum = 115;BA.debugLine="operand2 = EditText1.Text";
Debug.ShouldStop(262144);
main._operand2 = BA.numberCast(float.class, main.mostCurrent._edittext1.runMethod(true,"getText"));
 BA.debugLineNum = 117;BA.debugLine="If addition = True Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",main._addition,main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 118;BA.debugLine="EditText1.Text = operand1 + operand2";
Debug.ShouldStop(2097152);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {main._operand1,main._operand2}, "+",1, 0)));
 BA.debugLineNum = 119;BA.debugLine="addition = False";
Debug.ShouldStop(4194304);
main._addition = main.mostCurrent.__c.getField(true,"False");
 }else 
{ BA.debugLineNum = 120;BA.debugLine="Else If subtraction = True Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",main._subtraction,main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 121;BA.debugLine="EditText1.Text = operand1 - operand2";
Debug.ShouldStop(16777216);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {main._operand1,main._operand2}, "-",1, 0)));
 BA.debugLineNum = 122;BA.debugLine="subtraction = False";
Debug.ShouldStop(33554432);
main._subtraction = main.mostCurrent.__c.getField(true,"False");
 }else 
{ BA.debugLineNum = 123;BA.debugLine="Else If multiplication = True Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",main._multiplication,main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 124;BA.debugLine="EditText1.Text = operand1 * operand2";
Debug.ShouldStop(134217728);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {main._operand1,main._operand2}, "*",0, 0)));
 BA.debugLineNum = 125;BA.debugLine="multiplication = False";
Debug.ShouldStop(268435456);
main._multiplication = main.mostCurrent.__c.getField(true,"False");
 }else 
{ BA.debugLineNum = 126;BA.debugLine="Else If division = True Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",main._division,main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 127;BA.debugLine="EditText1.Text = operand1 / operand2";
Debug.ShouldStop(1073741824);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {main._operand1,main._operand2}, "/",0, 0)));
 BA.debugLineNum = 128;BA.debugLine="division = False";
Debug.ShouldStop(-2147483648);
main._division = main.mostCurrent.__c.getField(true,"False");
 }}}}
;
 BA.debugLineNum = 131;BA.debugLine="operand1 = 0";
Debug.ShouldStop(4);
main._operand1 = BA.numberCast(float.class, 0);
 BA.debugLineNum = 132;BA.debugLine="operand2 = 0";
Debug.ShouldStop(8);
main._operand2 = BA.numberCast(float.class, 0);
 BA.debugLineNum = 133;BA.debugLine="hasOp = False";
Debug.ShouldStop(16);
main._hasop = main.mostCurrent.__c.getField(true,"False");
 }else 
{ BA.debugLineNum = 135;BA.debugLine="Else If button.Tag = \"clear\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("clear")))) { 
 BA.debugLineNum = 136;BA.debugLine="EditText1.Text = \"\"";
Debug.ShouldStop(128);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 }}}}
;
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="Private EditText1 As EditText";
main.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private clearbtn As Button";
main.mostCurrent._clearbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private delbtn As Button";
main.mostCurrent._delbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private dividebtn As Button";
main.mostCurrent._dividebtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private timesbtn As Button";
main.mostCurrent._timesbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private minusbtn As Button";
main.mostCurrent._minusbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private plusbtn As Button";
main.mostCurrent._plusbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private percentbtn As Button";
main.mostCurrent._percentbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private periodbtn As Button";
main.mostCurrent._periodbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private plusminusbtn As Button";
main.mostCurrent._plusminusbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private eightbtn As Button";
main.mostCurrent._eightbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private equalbtn As Button";
main.mostCurrent._equalbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private fivebtn As Button";
main.mostCurrent._fivebtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private fourbtn As Button";
main.mostCurrent._fourbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private ninebtn As Button";
main.mostCurrent._ninebtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private onebtn As Button";
main.mostCurrent._onebtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private sevenbtn As Button";
main.mostCurrent._sevenbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private sixbtn As Button";
main.mostCurrent._sixbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private threebtn As Button";
main.mostCurrent._threebtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private twobtn As Button";
main.mostCurrent._twobtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private zerobtn As Button";
main.mostCurrent._zerobtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Dim operand1, operand2 As Float";
main._operand1 = RemoteObject.createImmutable(0f);
main._operand2 = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 51;BA.debugLine="Dim addition, subtraction, multiplication, divisi";
main._addition = RemoteObject.createImmutable(false);
main._subtraction = RemoteObject.createImmutable(false);
main._multiplication = RemoteObject.createImmutable(false);
main._division = RemoteObject.createImmutable(false);
main._hasop = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
xuiviewsutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
animatedcounter.myClass = BA.getDeviceClass ("b4a.example.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("b4a.example.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("b4a.example.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("b4a.example.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("b4a.example.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("b4a.example.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("b4a.example.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("b4a.example.b4xfloattextfield");
b4ximageview.myClass = BA.getDeviceClass ("b4a.example.b4ximageview");
b4xinputtemplate.myClass = BA.getDeviceClass ("b4a.example.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("b4a.example.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("b4a.example.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("b4a.example.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("b4a.example.b4xplusminus");
b4xradiobutton.myClass = BA.getDeviceClass ("b4a.example.b4xradiobutton");
b4xsearchtemplate.myClass = BA.getDeviceClass ("b4a.example.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("b4a.example.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("b4a.example.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("b4a.example.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("b4a.example.b4xtimedtemplate");
madewithlove.myClass = BA.getDeviceClass ("b4a.example.madewithlove");
b4xformatter.myClass = BA.getDeviceClass ("b4a.example.b4xformatter");
roundslider.myClass = BA.getDeviceClass ("b4a.example.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("b4a.example.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("b4a.example.swiftbutton");
xuiviewsutils.myClass = BA.getDeviceClass ("b4a.example.xuiviewsutils");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 20;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}