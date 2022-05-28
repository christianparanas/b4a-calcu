package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class scrollinglabel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.scrollinglabel");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.scrollinglabel.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public String _mtext = "";
public int _taskindex = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public Object _tag = null;
public int _widthpersecond = 0;
public int _startpositiondelay = 0;
public int _mtextcolor = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4a.example.scrollinglabel __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="scrollinglabel";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="setText(mText)";
__ref._settext /*String*/ (null,__ref._mtext /*String*/ );
RDebugUtils.currentLine=20054019;
 //BA.debugLineNum = 20054019;BA.debugLine="End Sub";
return "";
}
public String  _settext(b4a.example.scrollinglabel __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="scrollinglabel";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_t}));}
boolean _needtocreatenewlabel = false;
anywheresoftware.b4a.objects.B4XViewWrapper _parent = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
float _originaltextwidth = 0f;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
String _duplicatetext = "";
float _width = 0f;
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Public Sub setText(t As String)";
RDebugUtils.currentLine=20119553;
 //BA.debugLineNum = 20119553;BA.debugLine="Dim NeedToCreateNewLabel As Boolean = True";
_needtocreatenewlabel = __c.True;
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="Dim parent As B4XView = mBase.GetView(0)";
_parent = new anywheresoftware.b4a.objects.B4XViewWrapper();
_parent = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=20119555;
 //BA.debugLineNum = 20119555;BA.debugLine="If parent.NumberOfViews > 0 Then";
if (_parent.getNumberOfViews()>0) { 
RDebugUtils.currentLine=20119557;
 //BA.debugLineNum = 20119557;BA.debugLine="Dim p As B4XView = parent.GetView(0)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _parent.GetView((int) (0));
RDebugUtils.currentLine=20119558;
 //BA.debugLineNum = 20119558;BA.debugLine="If p.Tag = \"static\" Then";
if ((_p.getTag()).equals((Object)("static"))) { 
RDebugUtils.currentLine=20119559;
 //BA.debugLineNum = 20119559;BA.debugLine="NeedToCreateNewLabel = False";
_needtocreatenewlabel = __c.False;
RDebugUtils.currentLine=20119560;
 //BA.debugLineNum = 20119560;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, parent.Width, pare";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_parent.getWidth(),_parent.getHeight());
RDebugUtils.currentLine=20119561;
 //BA.debugLineNum = 20119561;BA.debugLine="Dim xlbl As B4XView = p.GetView(0)";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = _p.GetView((int) (0));
RDebugUtils.currentLine=20119562;
 //BA.debugLineNum = 20119562;BA.debugLine="xlbl.SetLayoutAnimated(0, 0, 0, parent.Width, p";
_xlbl.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_parent.getWidth(),_parent.getHeight());
 };
 };
RDebugUtils.currentLine=20119566;
 //BA.debugLineNum = 20119566;BA.debugLine="Dim originalTextWidth As Float = MeasureTextWidth";
_originaltextwidth = __ref._measuretextwidth /*float*/ (null,_t,__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=20119567;
 //BA.debugLineNum = 20119567;BA.debugLine="mText = t";
__ref._mtext /*String*/  = _t;
RDebugUtils.currentLine=20119568;
 //BA.debugLineNum = 20119568;BA.debugLine="If NeedToCreateNewLabel Then";
if (_needtocreatenewlabel) { 
RDebugUtils.currentLine=20119569;
 //BA.debugLineNum = 20119569;BA.debugLine="parent.RemoveAllViews";
_parent.RemoveAllViews();
RDebugUtils.currentLine=20119570;
 //BA.debugLineNum = 20119570;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=20119571;
 //BA.debugLineNum = 20119571;BA.debugLine="parent.AddView(p, 0, 0, parent.Width, parent.Hei";
_parent.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),_parent.getWidth(),_parent.getHeight());
RDebugUtils.currentLine=20119572;
 //BA.debugLineNum = 20119572;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=20119573;
 //BA.debugLineNum = 20119573;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=20119575;
 //BA.debugLineNum = 20119575;BA.debugLine="lbl.SingleLine = True";
_lbl.setSingleLine(__c.True);
RDebugUtils.currentLine=20119576;
 //BA.debugLineNum = 20119576;BA.debugLine="lbl.Padding = Array As Int(0, 0, 0, 0)";
_lbl.setPadding(new int[]{(int) (0),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=20119578;
 //BA.debugLineNum = 20119578;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=20119579;
 //BA.debugLineNum = 20119579;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"LEFT\")";
_xlbl.SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=20119580;
 //BA.debugLineNum = 20119580;BA.debugLine="xlbl.Font = fnt";
_xlbl.setFont(__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=20119582;
 //BA.debugLineNum = 20119582;BA.debugLine="p.AddView(xlbl, 0, 0, mBase.Width, mBase.Height)";
_p.AddView((android.view.View)(_xlbl.getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 };
RDebugUtils.currentLine=20119584;
 //BA.debugLineNum = 20119584;BA.debugLine="xlbl.TextColor = mTextColor";
_xlbl.setTextColor(__ref._mtextcolor /*int*/ );
RDebugUtils.currentLine=20119585;
 //BA.debugLineNum = 20119585;BA.debugLine="If originalTextWidth <= mBase.Width Then";
if (_originaltextwidth<=__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()) { 
RDebugUtils.currentLine=20119586;
 //BA.debugLineNum = 20119586;BA.debugLine="xlbl.Text = t";
_xlbl.setText(BA.ObjectToCharSequence(_t));
RDebugUtils.currentLine=20119587;
 //BA.debugLineNum = 20119587;BA.debugLine="p.Tag = \"static\"";
_p.setTag((Object)("static"));
RDebugUtils.currentLine=20119588;
 //BA.debugLineNum = 20119588;BA.debugLine="StopScrolling";
__ref._stopscrolling /*String*/ (null);
 }else {
RDebugUtils.currentLine=20119590;
 //BA.debugLineNum = 20119590;BA.debugLine="p.Tag = \"\"";
_p.setTag((Object)(""));
RDebugUtils.currentLine=20119591;
 //BA.debugLineNum = 20119591;BA.debugLine="Dim duplicateText As String = t & \"   \" & t";
_duplicatetext = _t+"   "+_t;
RDebugUtils.currentLine=20119592;
 //BA.debugLineNum = 20119592;BA.debugLine="Dim Width As Float = MeasureTextWidth(duplicateT";
_width = __ref._measuretextwidth /*float*/ (null,_duplicatetext,__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=20119593;
 //BA.debugLineNum = 20119593;BA.debugLine="p.Width = Width";
_p.setWidth((int) (_width));
RDebugUtils.currentLine=20119594;
 //BA.debugLineNum = 20119594;BA.debugLine="xlbl.Width = Width";
_xlbl.setWidth((int) (_width));
RDebugUtils.currentLine=20119595;
 //BA.debugLineNum = 20119595;BA.debugLine="xlbl.Text = duplicateText";
_xlbl.setText(BA.ObjectToCharSequence(_duplicatetext));
RDebugUtils.currentLine=20119596;
 //BA.debugLineNum = 20119596;BA.debugLine="StartScrolling (p, originalTextWidth)";
__ref._startscrolling /*void*/ (null,_p,_originaltextwidth);
 };
RDebugUtils.currentLine=20119598;
 //BA.debugLineNum = 20119598;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.scrollinglabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scrollinglabel";
RDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=19857409;
 //BA.debugLineNum = 19857409;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=19857410;
 //BA.debugLineNum = 19857410;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=19857411;
 //BA.debugLineNum = 19857411;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=19857412;
 //BA.debugLineNum = 19857412;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=19857413;
 //BA.debugLineNum = 19857413;BA.debugLine="Private mText As String";
_mtext = "";
RDebugUtils.currentLine=19857414;
 //BA.debugLineNum = 19857414;BA.debugLine="Private taskIndex As Int";
_taskindex = 0;
RDebugUtils.currentLine=19857415;
 //BA.debugLineNum = 19857415;BA.debugLine="Private fnt As B4XFont";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=19857416;
 //BA.debugLineNum = 19857416;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=19857417;
 //BA.debugLineNum = 19857417;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=19857418;
 //BA.debugLineNum = 19857418;BA.debugLine="Public WidthPerSecond As Int = 100dip";
_widthpersecond = __c.DipToCurrent((int) (100));
RDebugUtils.currentLine=19857419;
 //BA.debugLineNum = 19857419;BA.debugLine="Public StartPositionDelay As Int = 1000";
_startpositiondelay = (int) (1000);
RDebugUtils.currentLine=19857420;
 //BA.debugLineNum = 19857420;BA.debugLine="Private mTextColor As Int = xui.Color_Black";
_mtextcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=19857421;
 //BA.debugLineNum = 19857421;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.scrollinglabel __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="scrollinglabel";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _l = null;
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=19988484;
 //BA.debugLineNum = 19988484;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=19988485;
 //BA.debugLineNum = 19988485;BA.debugLine="mBase.AddView(p, 0, 0, mBase.Width, mBase.Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=19988486;
 //BA.debugLineNum = 19988486;BA.debugLine="mText = Lbl.Text";
__ref._mtext /*String*/  = _lbl.getText();
RDebugUtils.currentLine=19988487;
 //BA.debugLineNum = 19988487;BA.debugLine="Dim l As B4XView = Lbl";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=19988488;
 //BA.debugLineNum = 19988488;BA.debugLine="fnt = l.Font";
__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _l.getFont();
RDebugUtils.currentLine=19988489;
 //BA.debugLineNum = 19988489;BA.debugLine="mTextColor = l.TextColor";
__ref._mtextcolor /*int*/  = _l.getTextColor();
RDebugUtils.currentLine=19988490;
 //BA.debugLineNum = 19988490;BA.debugLine="If mTextColor = xui.Color_Transparent Then mTextC";
if (__ref._mtextcolor /*int*/ ==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent) { 
__ref._mtextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;};
RDebugUtils.currentLine=19988491;
 //BA.debugLineNum = 19988491;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=19988492;
 //BA.debugLineNum = 19988492;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 2dip, 2dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=19988493;
 //BA.debugLineNum = 19988493;BA.debugLine="cvs.Initialize(p)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(_p);
RDebugUtils.currentLine=19988494;
 //BA.debugLineNum = 19988494;BA.debugLine="setText(mText)";
__ref._settext /*String*/ (null,__ref._mtext /*String*/ );
RDebugUtils.currentLine=19988495;
 //BA.debugLineNum = 19988495;BA.debugLine="End Sub";
return "";
}
public String  _gettext(b4a.example.scrollinglabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scrollinglabel";
if (Debug.shouldDelegate(ba, "gettext", true))
	 {return ((String) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=20185088;
 //BA.debugLineNum = 20185088;BA.debugLine="Public Sub getText As String";
RDebugUtils.currentLine=20185089;
 //BA.debugLineNum = 20185089;BA.debugLine="Return mText";
if (true) return __ref._mtext /*String*/ ;
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="End Sub";
return "";
}
public int  _gettextcolor(b4a.example.scrollinglabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scrollinglabel";
if (Debug.shouldDelegate(ba, "gettextcolor", true))
	 {return ((Integer) Debug.delegate(ba, "gettextcolor", null));}
RDebugUtils.currentLine=20512768;
 //BA.debugLineNum = 20512768;BA.debugLine="Public Sub getTextColor As Int";
RDebugUtils.currentLine=20512769;
 //BA.debugLineNum = 20512769;BA.debugLine="Return mTextColor";
if (true) return __ref._mtextcolor /*int*/ ;
RDebugUtils.currentLine=20512770;
 //BA.debugLineNum = 20512770;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.example.scrollinglabel __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="scrollinglabel";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=19922945;
 //BA.debugLineNum = 19922945;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=19922946;
 //BA.debugLineNum = 19922946;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=19922947;
 //BA.debugLineNum = 19922947;BA.debugLine="End Sub";
return "";
}
public float  _measuretextwidth(b4a.example.scrollinglabel __ref,String _s,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1) throws Exception{
__ref = this;
RDebugUtils.currentModule="scrollinglabel";
if (Debug.shouldDelegate(ba, "measuretextwidth", true))
	 {return ((Float) Debug.delegate(ba, "measuretextwidth", new Object[] {_s,_font1}));}
RDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Private Sub MeasureTextWidth(s As String, font1 As";
RDebugUtils.currentLine=20381697;
 //BA.debugLineNum = 20381697;BA.debugLine="Return cvs.MeasureText(s, font1).Width";
if (true) return __ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(_s,_font1).getWidth();
RDebugUtils.currentLine=20381698;
 //BA.debugLineNum = 20381698;BA.debugLine="End Sub";
return 0f;
}
public String  _stopscrolling(b4a.example.scrollinglabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scrollinglabel";
if (Debug.shouldDelegate(ba, "stopscrolling", true))
	 {return ((String) Debug.delegate(ba, "stopscrolling", null));}
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Private Sub StopScrolling";
RDebugUtils.currentLine=20250625;
 //BA.debugLineNum = 20250625;BA.debugLine="taskIndex = taskIndex + 1";
__ref._taskindex /*int*/  = (int) (__ref._taskindex /*int*/ +1);
RDebugUtils.currentLine=20250626;
 //BA.debugLineNum = 20250626;BA.debugLine="End Sub";
return "";
}
public void  _startscrolling(b4a.example.scrollinglabel __ref,anywheresoftware.b4a.objects.B4XViewWrapper _p,float _originalwidth) throws Exception{
RDebugUtils.currentModule="scrollinglabel";
if (Debug.shouldDelegate(ba, "startscrolling", true))
	 {Debug.delegate(ba, "startscrolling", new Object[] {_p,_originalwidth}); return;}
ResumableSub_StartScrolling rsub = new ResumableSub_StartScrolling(this,__ref,_p,_originalwidth);
rsub.resume(ba, null);
}
public static class ResumableSub_StartScrolling extends BA.ResumableSub {
public ResumableSub_StartScrolling(b4a.example.scrollinglabel parent,b4a.example.scrollinglabel __ref,anywheresoftware.b4a.objects.B4XViewWrapper _p,float _originalwidth) {
this.parent = parent;
this.__ref = __ref;
this._p = _p;
this._originalwidth = _originalwidth;
this.__ref = parent;
}
b4a.example.scrollinglabel __ref;
b4a.example.scrollinglabel parent;
anywheresoftware.b4a.objects.B4XViewWrapper _p;
float _originalwidth;
int _myindex = 0;
int _duration = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="scrollinglabel";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=20316161;
 //BA.debugLineNum = 20316161;BA.debugLine="taskIndex = taskIndex + 1";
__ref._taskindex /*int*/  = (int) (__ref._taskindex /*int*/ +1);
RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="Dim myIndex As Int = taskIndex";
_myindex = __ref._taskindex /*int*/ ;
RDebugUtils.currentLine=20316163;
 //BA.debugLineNum = 20316163;BA.debugLine="Dim duration As Int = p.Width / WidthPerSecond *";
_duration = (int) (_p.getWidth()/(double)__ref._widthpersecond /*int*/ *1000);
RDebugUtils.currentLine=20316164;
 //BA.debugLineNum = 20316164;BA.debugLine="Sleep(StartPositionDelay)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scrollinglabel", "startscrolling"),__ref._startpositiondelay /*int*/ );
this.state = 23;
return;
case 23:
//C
this.state = 1;
;
RDebugUtils.currentLine=20316165;
 //BA.debugLineNum = 20316165;BA.debugLine="If myIndex <> taskIndex Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_myindex!=__ref._taskindex /*int*/ ) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=20316166;
 //BA.debugLineNum = 20316166;BA.debugLine="Do While True";
if (true) break;

case 7:
//do while
this.state = 22;
while (parent.__c.True) {
this.state = 9;
if (true) break;
}
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=20316167;
 //BA.debugLineNum = 20316167;BA.debugLine="p.SetLayoutAnimated(duration, -(p.Width - Origin";
_p.SetLayoutAnimated(_duration,(int) (-(_p.getWidth()-_originalwidth)),_p.getTop(),_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=20316168;
 //BA.debugLineNum = 20316168;BA.debugLine="Sleep(duration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scrollinglabel", "startscrolling"),_duration);
this.state = 24;
return;
case 24:
//C
this.state = 10;
;
RDebugUtils.currentLine=20316169;
 //BA.debugLineNum = 20316169;BA.debugLine="If myIndex <> taskIndex Then Return";
if (true) break;

case 10:
//if
this.state = 15;
if (_myindex!=__ref._taskindex /*int*/ ) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=20316170;
 //BA.debugLineNum = 20316170;BA.debugLine="Sleep(StartPositionDelay)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scrollinglabel", "startscrolling"),__ref._startpositiondelay /*int*/ );
this.state = 25;
return;
case 25:
//C
this.state = 16;
;
RDebugUtils.currentLine=20316171;
 //BA.debugLineNum = 20316171;BA.debugLine="If myIndex <> taskIndex Then Return";
if (true) break;

case 16:
//if
this.state = 21;
if (_myindex!=__ref._taskindex /*int*/ ) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
if (true) return ;
if (true) break;

case 21:
//C
this.state = 7;
;
RDebugUtils.currentLine=20316172;
 //BA.debugLineNum = 20316172;BA.debugLine="p.SetLayoutAnimated(0, 0, p.Top, p.Width, p.Heig";
_p.SetLayoutAnimated((int) (0),(int) (0),_p.getTop(),_p.getWidth(),_p.getHeight());
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=20316174;
 //BA.debugLineNum = 20316174;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _settextcolor(b4a.example.scrollinglabel __ref,int _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="scrollinglabel";
if (Debug.shouldDelegate(ba, "settextcolor", true))
	 {return ((String) Debug.delegate(ba, "settextcolor", new Object[] {_c}));}
RDebugUtils.currentLine=20447232;
 //BA.debugLineNum = 20447232;BA.debugLine="Public Sub setTextColor(c As Int)";
RDebugUtils.currentLine=20447233;
 //BA.debugLineNum = 20447233;BA.debugLine="mTextColor = c";
__ref._mtextcolor /*int*/  = _c;
RDebugUtils.currentLine=20447234;
 //BA.debugLineNum = 20447234;BA.debugLine="setText(mText)";
__ref._settext /*String*/ (null,__ref._mtext /*String*/ );
RDebugUtils.currentLine=20447235;
 //BA.debugLineNum = 20447235;BA.debugLine="End Sub";
return "";
}
}