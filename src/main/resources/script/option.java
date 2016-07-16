// option.java
//
// Manage the view settings for the DataMaster by storing a cookie.
// Note that manually deleting the cookie while the browser is open will prevent a new cookie from being created.
//
// [SM]
//=======================================================================//

var expdate = new Date ();
expdate.setTime (expdate.getTime() + (24 * 60 * 60 * 1000*30)); // 30 days from now in milliseconds

function SetOption()
{
	if(document.optionform.radioset[0].checked) SetCookie('dataCookie', 'frames', expdate, '/');
	else SetCookie('dataCookie', 'popups', expdate, '/');
}

function SetCookie(name, value, expires, path, domain, secure)
{
	var thisCookie = name + "=" + escape(value) + ((expires) ? "; expires=" + expires.toGMTString() : "") + ((path) ? "; path=" + path : "") +
	((domain) ? "; domain=" + domain : "") + ((secure) ? "; secure" : "");
	document.cookie = thisCookie;
}

function DeleteCookie()
{
	var name="dataCookie";
	var path="/";
	var value=null;
	var time=new Date ();
	time.setTime(time.getTime());
	SetCookie(name, value, time, path);
}

function ShowCookie()
{
	alert(unescape(document.cookie));
}

function GetCookieVal(offset)
{
	var endstr = document.cookie.indexOf (";", offset);
	if(endstr == -1) endstr = document.cookie.length;
	return unescape(document.cookie.substring(offset, endstr));
}

function GetCookie(name)
{
	var arg = name + "=";
	var alen = arg.length;
	var clen = document.cookie.length;
	var i = 0;
	while (i < clen)
	{
		var j = i + alen;
		if (document.cookie.substring(i, j) == arg) return GetCookieVal(j);
		i = document.cookie.indexOf(" ", i) + 1;
		if (i == 0) break;
	}
	return null;
}

function PrepareForm()
{
	if(GetCookie('dataCookie') == 'frames') document.optionform.radioset[0].checked=true;
	else if (GetCookie('dataCookie') == 'popups') document.optionform.radioset[1].checked=true;
}

function Popup(myPage)
{
	w=500; h=400;
	LeftPosition=(screen.width)?(screen.width-w)/2:100;
	if(navigator.appName == 'Opera') TopPosition=1;
	else TopPosition=(screen.height)?(screen.height-h)/2:100;
	settings='width='+w+',height='+h+',top='+TopPosition+',left='+LeftPosition+',scrollbars=yes,location=no,directories=no,status=no,menubar=no,toolbar=no,resizable=yes';
	window.open(myPage, "popup", settings).focus();
}

function ShowPage(page)
{
	if(GetCookie('dataCookie') == 'frames')
	{
		top.frames[1].frames[1].location=page;
	}
	else
	{
		Popup(page);
	}
}

function FramePage(maindoc, notedoc, framesize, scroll)		// creates vertical frames.
{
	if(GetCookie('dataCookie') == 'frames')
	{
		if(framesize == null) framesize="35%";
		else if(navigator.appName.indexOf('Explorer') > -1) framesize += 4;
		if(scroll == null) scroll="auto";
		else if(scroll == 'yes')
		{
			framesize += 17;
			scroll="auto";
		}
		document.write('<FRAMESET COLS=" ' + framesize + ',*">');
		document.write('<FRAME name="cat" src="' + maindoc + '" scrolling=' + scroll + '>');
		document.write('<FRAME name="verb" src="' + notedoc + '">');
		document.write('</FRAMESET>');
	}
	else
	{
		location.replace(maindoc);
	}
}

function FramePage2(maindoc, notedoc)		// creates horizontal frames.
{
	if(GetCookie('dataCookie') == 'frames')
	{
		document.write('<FRAMESET ROWS="50%,*">');
		document.write('<FRAME name="cat" src="' + maindoc + '" scrolling=' + scroll + '>');
		document.write('<FRAME name="flag" src="' + notedoc + '">');
		document.write('</FRAMESET>');
	}
	else
	{
		location.replace(maindoc);
	}
}