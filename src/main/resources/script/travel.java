function Travel()
{
	var selected=document.relform.selection.selectedIndex;
	var value=document.relform.selection.options[selected].value;
	if (selected != 0)
	{
		location=value;
	}
}

function Travel3()
{
	var selected=document.relform2.selection.selectedIndex;
	var value=document.relform2.selection.options[selected].value;
	if (selected != 0)
	{
		location=value;
	}
}

function Travel2()
{
	var selected=document.relform.selection2.selectedIndex;
	var value=document.relform.selection2.options[selected].value;
	if (selected != 0)
	{
		location=value;
	}
}

function Travel4()
{
	var selected=document.relform2.selection2.selectedIndex;
	var value=document.relform2.selection2.options[selected].value;
	if (selected != 0)
	{
		location=value;
	}
}