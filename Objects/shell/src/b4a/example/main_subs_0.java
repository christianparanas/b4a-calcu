package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,52);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 52;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(1048576);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("btn_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,57);
if (RapidSub.canDelegate("btn_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btn_click");}
RemoteObject _button = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
 BA.debugLineNum = 57;BA.debugLine="Private Sub btn_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Dim button As Button = Sender";
Debug.ShouldStop(33554432);
_button = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_button = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), main.mostCurrent.__c.runMethod(false,"Sender",main.mostCurrent.activityBA));Debug.locals.put("button", _button);Debug.locals.put("button", _button);
 BA.debugLineNum = 60;BA.debugLine="If button.Tag = \"0\" Or button.Tag = \"1\" Or button";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("0"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("1"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("2"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("3"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("4"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("5"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("6"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("7"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("8"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("9")))) { 
 BA.debugLineNum = 61;BA.debugLine="If hasOp = True Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",main._hasop,main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 62;BA.debugLine="EditText1.Text = \"\"";
Debug.ShouldStop(536870912);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 };
 BA.debugLineNum = 65;BA.debugLine="If EditText1.Text = \"\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",main.mostCurrent._edittext1.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 66;BA.debugLine="hasOp = false";
Debug.ShouldStop(2);
main._hasop = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 67;BA.debugLine="EditText1.Text = button.Tag";
Debug.ShouldStop(4);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_button.runMethod(false,"getTag")));
 }else {
 BA.debugLineNum = 69;BA.debugLine="EditText1.Text = EditText1.Text & button.Tag";
Debug.ShouldStop(16);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._edittext1.runMethod(true,"getText"),_button.runMethod(false,"getTag"))));
 };
 }else 
{ BA.debugLineNum = 72;BA.debugLine="Else If button.Tag = \"+\" Or button.Tag = \"-\" Or b";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("+"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("-"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("*"))) || RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("/")))) { 
 BA.debugLineNum = 73;BA.debugLine="hasOp = True";
Debug.ShouldStop(256);
main._hasop = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 75;BA.debugLine="If button.Tag = \"+\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("+")))) { 
 BA.debugLineNum = 76;BA.debugLine="If EditText1.Text = \"\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",main.mostCurrent._edittext1.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 77;BA.debugLine="EditText1.Text = \"+\"";
Debug.ShouldStop(4096);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("+"));
 }else {
 BA.debugLineNum = 79;BA.debugLine="operand1 = EditText1.Text";
Debug.ShouldStop(16384);
main._operand1 = BA.numberCast(float.class, main.mostCurrent._edittext1.runMethod(true,"getText"));
 BA.debugLineNum = 80;BA.debugLine="addition = True";
Debug.ShouldStop(32768);
main._addition = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 81;BA.debugLine="EditText1.Text = \"+\"";
Debug.ShouldStop(65536);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("+"));
 };
 }else 
{ BA.debugLineNum = 84;BA.debugLine="Else If button.Tag = \"-\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("-")))) { 
 BA.debugLineNum = 85;BA.debugLine="If EditText1.Text = \"\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",main.mostCurrent._edittext1.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 86;BA.debugLine="EditText1.Text = \"-\"";
Debug.ShouldStop(2097152);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("-"));
 }else {
 BA.debugLineNum = 88;BA.debugLine="operand1 = EditText1.Text";
Debug.ShouldStop(8388608);
main._operand1 = BA.numberCast(float.class, main.mostCurrent._edittext1.runMethod(true,"getText"));
 BA.debugLineNum = 89;BA.debugLine="subtraction = True";
Debug.ShouldStop(16777216);
main._subtraction = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 90;BA.debugLine="EditText1.Text = \"-\"";
Debug.ShouldStop(33554432);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("-"));
 };
 }else 
{ BA.debugLineNum = 93;BA.debugLine="Else If button.Tag = \"*\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("*")))) { 
 BA.debugLineNum = 94;BA.debugLine="If EditText1.Text = \"\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",main.mostCurrent._edittext1.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 95;BA.debugLine="EditText1.Text = \"*\"";
Debug.ShouldStop(1073741824);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("*"));
 }else {
 BA.debugLineNum = 97;BA.debugLine="operand1 = EditText1.Text";
Debug.ShouldStop(1);
main._operand1 = BA.numberCast(float.class, main.mostCurrent._edittext1.runMethod(true,"getText"));
 BA.debugLineNum = 98;BA.debugLine="multiplication = True";
Debug.ShouldStop(2);
main._multiplication = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 99;BA.debugLine="EditText1.Text = \"*\"";
Debug.ShouldStop(4);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("*"));
 };
 }else 
{ BA.debugLineNum = 102;BA.debugLine="Else If button.Tag = \"/\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("/")))) { 
 BA.debugLineNum = 103;BA.debugLine="If EditText1.Text = \"\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",main.mostCurrent._edittext1.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 104;BA.debugLine="EditText1.Text = \"/\"";
Debug.ShouldStop(128);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("/"));
 }else {
 BA.debugLineNum = 106;BA.debugLine="operand1 = EditText1.Text";
Debug.ShouldStop(512);
main._operand1 = BA.numberCast(float.class, main.mostCurrent._edittext1.runMethod(true,"getText"));
 BA.debugLineNum = 107;BA.debugLine="division = True";
Debug.ShouldStop(1024);
main._division = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 108;BA.debugLine="EditText1.Text = \"/\"";
Debug.ShouldStop(2048);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("/"));
 };
 }}}}
;
 }else 
{ BA.debugLineNum = 112;BA.debugLine="Else If button.Tag = \"=\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("=")))) { 
 BA.debugLineNum = 113;BA.debugLine="operand2 = EditText1.Text";
Debug.ShouldStop(65536);
main._operand2 = BA.numberCast(float.class, main.mostCurrent._edittext1.runMethod(true,"getText"));
 BA.debugLineNum = 115;BA.debugLine="If addition = True Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",main._addition,main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 116;BA.debugLine="EditText1.Text = operand1 + operand2";
Debug.ShouldStop(524288);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {main._operand1,main._operand2}, "+",1, 0)));
 BA.debugLineNum = 117;BA.debugLine="addition = False";
Debug.ShouldStop(1048576);
main._addition = main.mostCurrent.__c.getField(true,"False");
 }else 
{ BA.debugLineNum = 118;BA.debugLine="Else If subtraction = True Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",main._subtraction,main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 119;BA.debugLine="EditText1.Text = operand1 - operand2";
Debug.ShouldStop(4194304);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {main._operand1,main._operand2}, "-",1, 0)));
 BA.debugLineNum = 120;BA.debugLine="subtraction = False";
Debug.ShouldStop(8388608);
main._subtraction = main.mostCurrent.__c.getField(true,"False");
 }else 
{ BA.debugLineNum = 121;BA.debugLine="Else If multiplication = True Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",main._multiplication,main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 122;BA.debugLine="EditText1.Text = operand1 * operand2";
Debug.ShouldStop(33554432);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {main._operand1,main._operand2}, "*",0, 0)));
 BA.debugLineNum = 123;BA.debugLine="multiplication = False";
Debug.ShouldStop(67108864);
main._multiplication = main.mostCurrent.__c.getField(true,"False");
 }else 
{ BA.debugLineNum = 124;BA.debugLine="Else If division = True Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",main._division,main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 125;BA.debugLine="EditText1.Text = operand1 / operand2";
Debug.ShouldStop(268435456);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {main._operand1,main._operand2}, "/",0, 0)));
 BA.debugLineNum = 126;BA.debugLine="division = False";
Debug.ShouldStop(536870912);
main._division = main.mostCurrent.__c.getField(true,"False");
 }}}}
;
 BA.debugLineNum = 129;BA.debugLine="operand1 = 0";
Debug.ShouldStop(1);
main._operand1 = BA.numberCast(float.class, 0);
 BA.debugLineNum = 130;BA.debugLine="operand2 = 0";
Debug.ShouldStop(2);
main._operand2 = BA.numberCast(float.class, 0);
 BA.debugLineNum = 131;BA.debugLine="hasOp = False";
Debug.ShouldStop(4);
main._hasop = main.mostCurrent.__c.getField(true,"False");
 }else 
{ BA.debugLineNum = 133;BA.debugLine="Else If button.Tag = \"clear\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("clear")))) { 
 BA.debugLineNum = 134;BA.debugLine="EditText1.Text = \"\"";
Debug.ShouldStop(32);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 }}}}
;
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private EditText1 As EditText";
main.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private clearbtn As Button";
main.mostCurrent._clearbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private delbtn As Button";
main.mostCurrent._delbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private dividebtn As Button";
main.mostCurrent._dividebtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private timesbtn As Button";
main.mostCurrent._timesbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private minusbtn As Button";
main.mostCurrent._minusbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private plusbtn As Button";
main.mostCurrent._plusbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private percentbtn As Button";
main.mostCurrent._percentbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private periodbtn As Button";
main.mostCurrent._periodbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private plusminusbtn As Button";
main.mostCurrent._plusminusbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private eightbtn As Button";
main.mostCurrent._eightbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private equalbtn As Button";
main.mostCurrent._equalbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private fivebtn As Button";
main.mostCurrent._fivebtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private fourbtn As Button";
main.mostCurrent._fourbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private ninebtn As Button";
main.mostCurrent._ninebtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private onebtn As Button";
main.mostCurrent._onebtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private sevenbtn As Button";
main.mostCurrent._sevenbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private sixbtn As Button";
main.mostCurrent._sixbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private threebtn As Button";
main.mostCurrent._threebtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private twobtn As Button";
main.mostCurrent._twobtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private zerobtn As Button";
main.mostCurrent._zerobtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Dim operand1, operand2 As Float";
main._operand1 = RemoteObject.createImmutable(0f);
main._operand2 = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 49;BA.debugLine="Dim addition, subtraction, multiplication, divisi";
main._addition = RemoteObject.createImmutable(false);
main._subtraction = RemoteObject.createImmutable(false);
main._multiplication = RemoteObject.createImmutable(false);
main._division = RemoteObject.createImmutable(false);
main._hasop = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}