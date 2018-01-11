var SSORestictedChars = new Array(5);
var SSOCONST_FLIED_DESC = 0;
var SSOCONST_FLIED_NOHIGHLIGHT = 1;
var SSOCONST_FLIED_NORMAL = 2;
var SSOCONST_FLIED_ID = SSOCONST_FLIED_NOHIGHLIGHT|SSOCONST_FLIED_NORMAL;

SSORestictedChars[SSOCONST_FLIED_DESC] = new Array(
	':', '.', '_', '?', '\\', '/', '{', '}',
	'\'', '~', '`', ';', '@', '#', '>', '<',
	'+', '^', '!', '=', '&', '?', ']', '[',
	'|', '%', '$', '*','"');
SSORestictedChars[SSOCONST_FLIED_NOHIGHLIGHT] = new Array('-');
SSORestictedChars[SSOCONST_FLIED_NORMAL] = new Array(' ', ',');
SSORestictedChars[SSOCONST_FLIED_ID] = new Array('(', ')');
var SSOAllFliedTypes= new Array(SSOCONST_FLIED_DESC, SSOCONST_FLIED_NOHIGHLIGHT,
						SSOCONST_FLIED_NORMAL, SSOCONST_FLIED_ID);
var SSORestictedNameChars= new Array(
	':', '_', '?', '\\', '/', '{', '}',
	'~', '`', ';', '@', '#', '>', '<',
	'+', '^', '!', '=', '&', '?', ']', '[',
	'|', '%', '$', '*', '(', ')');


function constructList(changededList, targetList, values, allowAll, trimIndex){
	var index = 0;
	var changeval ='';
	if (changededList){
		if (changededList.length){
			index = changededList.selectedIndex;
			changeval = changededList.options[index].value;
		}else {
			var ttp = changededList.type+'';
			if (ttp.toLowerCase() == 'hidden'){
				return;
			}
			index = 1;
			changeval = changededList.value;
		}
	}else {
		return ;
	}
	if(!targetList){
		return ;
	}
	if( (index>0) && (trimIndex) ){
		index = index-1;
	}
	
	if (index >= values.length) return;
	for(i= (targetList.options.length-1);
		i >=0 ; i--){
		targetList.options[i]=null;
	}
	var newVals	 = values[index];
	if ( (!newVals) || (newVals==null)){
		targetList.disabled=true;
		return ;
	}
	targetList.disabled=false;
	count = 0;
	if (allowAll){
		if(newVals.length>1){ 
			targetList.options[count++]=new Option("ALL Options","*");
		}
	}
	if(changeval=="*") return;
	var arrLookup = new Array();
	for(i=0;i<newVals.length;i++){
		targetList.options[i+count]=new Option(newVals[i][1],newVals[i][0]);
	}
	
	for(i=0;i<newVals.length;i++){
		targetList.options[i+count]=new Option(newVals[i][1],newVals[i][0]);
	}
	sortList(targetList);
}
function upperText(target){
	var val = target.value+'';
	var newVal=val.toUpperCase();
	if (newVal==val) return;
	target.value=newVal;
	
}
function lowerText(target){
	var val = target.value+'';
	var newVal=val.toLowerCase();
	if (newVal==val) return;
	target.value=newVal;
	
}
function setList(target, val, buFirstAtt){
	if (!target) return;
	if (!target.length) return;
	if (buFirstAtt){
		val = val+'';
		if (val.indexOf(",") > 0 ){
			val = val.substring(0,val.indexOf(","));
		}
		for(i=0;i<target.length;i++){
			var tt = target.options[i].value+''
			if (tt.indexOf(",")>0){
				tt = tt.substring(0,tt.indexOf(","));
				if (tt == val){
					target.options[i].selected=true;
					return;
				}
			}else {
				if (target.options[i].value == val){
					target.options[i].selected=true;
					return;
				}
			}
		}
	}else {
		for(i=0;i<target.length;i++){
			if (target.options[i].value == val){
				target.options[i].selected=true;
				return;
			}
		}
	} 
}
var MonthName=new Array("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
			"Aug", "Sep", "Oct", "Nov", "Dec");
function changeDateDisplay(yearSelect, monthSelect, daySelect){
	var yyyy = yearSelect.value;
	var month = monthSelect.value;
	var dayLen = daySelect.options.length;
	var selectIn = daySelect.selectedIndex;
	var newDayLength = 31;
	if(yyyy==-1){
		for(i=daySelect.options.length;i>=0;i--){
			daySelect.options[i] =  null;
		}
		daySelect.options[0] =new Option("-","-");
		daySelect.disabled=true;
		for(i=monthSelect.options.length;i>=0;i--){
			monthSelect.options[i] =  null;
		}
		monthSelect.options[0] =new Option("-","-");
		monthSelect.disabled=true;
		return;
	}else if(yyyy==3333){
		for(i=daySelect.options.length;i>=0;i--){
			daySelect.options[i] =  null;
		}
		daySelect.options[0] =new Option("-","3");
		daySelect.disabled=true;
		for(i=monthSelect.options.length;i>=0;i--){
			monthSelect.options[i] =  null;
		}
		monthSelect.options[0] =new Option("-","3");
		monthSelect.disabled=true;
		return;
	}else if (monthSelect.options.length<12){
		for(i=monthSelect.options.length;i>=0;i--){
			monthSelect.options[i] =  null;
		}
		for(i=0;i< 12;i++){
			var mm = (i+1)+"";
			monthSelect.options[i] =new Option(MonthName[i],mm);
		}
	}
	daySelect.disabled=false;
	monthSelect.disabled=false;

	if( (month==4) || (month==6) || (month==9) ||
				(month==11) ) {
		newDayLength = 30;
	}else if (month == 2){
		if ( (yyyy % 4) != 0 ){
			newDayLength = 28;
		}else if ( ((yyyy%100)==0) && ((yyyy%400)!=0) ){
			newDayLength = 28;
		}else {
			newDayLength = 29;
		}
	}
	if (dayLen == newDayLength) return;
	for(i=daySelect.options.length;i>=0;i--){
		daySelect.options[i] =  null;
	}
	
	for(i=1;i<newDayLength+1;i++){
		var dd = i+"";
		daySelect.options[i-1] =new Option(dd,dd);
	}
	if (selectIn<newDayLength){
		daySelect.options[selectIn].selected = true;
	}
}
var openWin;
function openNewWin(pageURL, name , size){
	var status ="scrollbars=yes, status=yes, resizable=yes";
	if (false){
		if (size){
			status+=","+'fullscreen';
		}else {
			status+=",width=750, height=550";
		}	
	}
	status+=","+'fullscreen';
	var oWin = window.open(pageURL, name, status);
	oWin.focus();
}

var noBlankField = new Array(3);
noBlankField[0] = new  Array(10);
noBlankField[1] = new  Array(10);
noBlankField[2] = new  Array(10);

var blankCheckField = new Array(3);
blankCheckField[0] = new  Array(10);
blankCheckField[1] = new  Array(10);
blankCheckField[2] = new  Array(10);

var noBlankFieldCount =0;
var blankCheckFieldCount =0;

function clearNoBlankField(){
	noBlankFieldCount =0;
	blankCheckFieldCount =0;
}

function addBlankCheckField(f, desc, fliedType){
		var ty = parseInt(fliedType); 
		var tt = parseInt(fliedType)+'';
		if( tt=='NaN'){
			ty = SSOCONST_FLIED_NORMAL;
		}
		blankCheckField[0][blankCheckFieldCount] = f;
		blankCheckField[1][blankCheckFieldCount] = desc;
		blankCheckField[2][blankCheckFieldCount] = ty;
		blankCheckFieldCount++;
}

function addNoBlankField(f, desc, fliedType){
		var ty = parseInt(fliedType); 
		var tt = parseInt(fliedType)+'';
		if( tt=='NaN'){
			ty = SSOCONST_FLIED_NORMAL;
		}
		noBlankField[0][noBlankFieldCount] = f;
		noBlankField[1][noBlankFieldCount] = desc;
		noBlankField[2][noBlankFieldCount] = ty;
		noBlankFieldCount++;
}
function checkField22(noBlank, ff, decs, type){
	if(!ff) return true;
	if(ff.length){
		if(ff.options[ff.selectedIndex].value=='*'){
			alert(decs+'');
			if(!ff.disabled){
				ff.focus();
			}
			return false;
		}	
	}else{
		if(noBlank){
			var ft = ff.value+'';
			if(ft==''){
				alert(decs+'');
				if(!ff.disabled){
					ff.focus();
				}
				return false;
			}	
		}
		if (!checkCharacters(ff, type, noBlank)){
			alert(decs+'');
			if(!ff.disabled){
				ff.focus();
			}
			return false;
		}
	}
	return true;
}

function checkField(noBlank){
	var i;
	for(i=0;i<noBlankFieldCount;i++){
//		alert("noBlankFieldCount="+noBlankFieldCount+" i="+i);
		var ff = noBlankField[0][i];
		if (!ff) continue;
		if (!checkField22(noBlank, ff, noBlankField[1][i], noBlankField[2][i])){
//			alert("noBlankFieldCount="+noBlankFieldCount+" i="+i+" false");
				return false;
		}
	}
	for(i=0;i<blankCheckFieldCount;i++){
		var ff = blankCheckField[0][i];
		if (!ff) continue;
		if (!checkField22(false, ff, blankCheckField[1][i], blankCheckField[2][i])){
			return false;
		}
	}
	return true;
}
var dateList = new Array(1);
var AdateList = new Array(1);
var dateCount =0;
var dateCount2 =0;
function needAfterToday(d1, m1, y1, name){
	AdateList[dateCount2] = new Array(4);
	AdateList[dateCount2][0] = d1+'';
	AdateList[dateCount2][1] = m1+'';
	AdateList[dateCount2][2] = y1+'';
	AdateList[dateCount2][3] = name+'';
	dateCount2++;
}
function needCheckDates(d1, m1, y1, d2, m2, y2, name){
	dateList[dateCount] = new Array(7);
	dateList[dateCount][0] = d1+'';
	dateList[dateCount][1] = m1+'';
	dateList[dateCount][2] = y1+'';
	dateList[dateCount][3] = d2+'';
	dateList[dateCount][4] = m2+'';
	dateList[dateCount][5] = y2+'';
	dateList[dateCount][6] = name+'';
	dateCount++;
}

function isSepicalDate(year){
	var isSepical = false;
	var yearStr =year+'@';
	if(yearStr=='@') return true;
	isSepical=(yearStr=='1@') ||(yearStr=='3333@') || (yearStr=='-1@')  ;
	return isSepical;
}

function checkDatesAfterToday(f){
	for(i=0;i<dateCount2;i++){
		var y1=-1;
		var m1=-1;
		var d1=-1;
		var ff = false;
		if(f.elements[AdateList[i][2]]){
			y1=f.elements[AdateList[i][2]].value;
			ff=true;
		}
		if(f.elements[AdateList[i][1]]){
			m1=f.elements[AdateList[i][1]].value;
		}
		if(f.elements[AdateList[i][0]]){
			d1=f.elements[AdateList[i][0]].value;
		}

		if(isSepicalDate(d1)) {
			return true;
		}
		
		if( !checkAfterToday(y1, m1, d1) ){
		 	alert("Sorry, the "+AdateList[i][3]+" must on or after today!");
		 	if((!f.elements[AdateList[i][0]].disabled) && ff){
			 	f.elements[AdateList[i][0]].focus();
			}
		 	return false; 
		}
	}
	return true;
}


function checkTowDates(f){
	for(i=0;i<dateCount;i++){
		var y1=-1;
		var m1=-1;
		var d1=-1;
		var y2=-1;
		var m2=-1;
		var d2=-1;
		var ff = false;
		if(f.elements[dateList[i][0]]){
			y1=f.elements[dateList[i][0]].value;
		}
		if(f.elements[dateList[i][1]]){
			m1=f.elements[dateList[i][1]].value;
		}
		if(f.elements[dateList[i][2]]){
			d1=f.elements[dateList[i][2]].value;
		}
		if(f.elements[dateList[i][3]]){
			y2=f.elements[dateList[i][3]].value;
			ff=true;
		}
		if(isSepicalDate(y2)) {
			continue;
		}
		if(f.elements[dateList[i][4]]){
			m2=f.elements[dateList[i][4]].value;
		}
		if(f.elements[dateList[i][5]]){
			d2=f.elements[dateList[i][5]].value;
		}
		if( !check2Dates( y1, m1, d1, y2, m2, d2, true)){
		 	alert("Sorry, end date of "+dateList[i][6]+" is earlier than begin date!");
			if((!f.elements[dateList[i][3]].disabled) && ff){
			 	f.elements[dateList[i][3]].focus();
			}
		 	return false; 
		}
	}
	return true;
}	

function check2Dates(y1, m1, d1, y2, m2, d2, limitEnd){
	if(isSepicalDate(y2)) {
		if(isSepicalDate(y1)) {
			return true;
		}else if(limitEnd){
			return false;
		}
	}
	if(isSepicalDate(y1)) {
		return true;
	}
	if (y2 < 0) return true;
	if (limitEnd){
		if (y1 < 0) return false;
	}
	if (y1 < 0) return true;
	if(y1.length==1)y1='0'+y1;
	if(y2.length==1)y2='0'+y2;
	if(m1.length==1)m1='0'+m1;
	if(m2.length==1)m2='0'+m2;
	if(d1.length==1)d1='0'+d1;
	if(d2.length==1)d2='0'+d2;
	if (y2>y1) return true;
	if (y2<y1) return false;
	if (m2>m1) return true;
	if (m2<m1) return false;
	return (d2>=d1);
}

function checkCharacters(f, type, noblank){
//	alert("SSOAllFliedTypes.length="+SSOAllFliedTypes.length);
	if(noblank){
		var str = f.value+'@';
		if(str=='@'){
			return false;
		}
	}
	var i;
	for( i=0;i<SSOAllFliedTypes.length;i++){
//	alert("orgType="+ SSOAllFliedTypes[i]);
		var fType = type & SSOAllFliedTypes[i];
//	alert("check type="+fType+", old type="+type+", orgType="+ SSOAllFliedTypes[i]);
		if (fType==SSOAllFliedTypes[i]){
			if(!checkCharactersWithList(f, SSORestictedChars[fType])){
//	alert("return flase");
				return false;
			}
		}
	}
//	alert("return ture, i="+i);
	return true;
}

function checkCharactersWithList(f, clist){
	str = f.value+'A';
	for(i=0;i<clist.length;i++){
		if (str.indexOf(clist[i])>=0) return false;
	}
	return true;
}

var NIL_VALUE="@_@";
var MORE_VALUE="@-@";

function  getSingleSelectValue(f, msg, displayNULL){
	var selectedValue=NIL_VALUE;
	var selected = 0;
	if(f){
		if(f.options){
			for(i=0;i<f.options.length;i++){
				if(f.options[i].selected){
					selectedValue = f.options[i].value;
					selected ++;
				}
			}
		}if(!f.length){
			if(f.checked) selected=1;
			selectedValue = f.value;
		}else{ 
			for(i=0;i<f.length;i++){
				if(f[i].checked){
					selectedValue = f[i].value;
					selected ++;
				}
			}
		}
		if (selected == 0){
			if (!displayNULL){
				alert("Please select one "+msg);
			}
			return NIL_VALUE;
		}else if (selected > 1){
			alert("Please select only one "+msg);
			return MORE_VALUE;
		}
	}
	return selectedValue;
}

function windowRefresh(){
	if (document){
		if (document.SSOREFRESHPAGE_FLAG){
			if (document.SSOREFRESHPAGE_FLAG.value=='Y'){
				document.location=SSOPRELink;
			}
		}else {
			document.location=SSOPRELink;
		}
	}
}

function windowRefresh_old(){
	if (document.all){
		if (document.all.buttonDIV){
			var text = document.all.buttonDIV.innerHTML+'';
			var idTest =' id=refreshButton ';
			if (text.indexOf(idTest)<0){
				document.all.buttonDIV.innerHTML =text+"<input type='button' class='buttonOrange' style='WIDTH: 100px'"
				+ idTest +" value='Refresh' onclick='javascript:document.location=SSOPRELink'>";
			}
			alert("Displaying data may be changed by others,\nplease click refresh button to get new data!");
		}
	}
}

function sortList(traget){
	var arrTbox = new Array();
	var arrLookup = new Array();
	var i;
	for (i = 0; i < traget.options.length; i++) {
		arrLookup[traget.options[i].text] = traget.options[i].value;
		arrTbox[i] = traget.options[i].text;
	}
	var tLength = arrTbox.length;
	arrTbox.sort();
	for(c = 0; c < arrTbox.length; c++) {
	var no = new Option();
	no.value = arrLookup[arrTbox[c]];
	no.text = arrTbox[c];
	traget[c] = no;
   }
}


function findObject(name){
	for(i=0;i<window.document.forms.length;i++){
		var f = window.document.forms[i];
		for(j=0;j<f.elements.length;j++){
			if(f.elements[j]){
				if(f.elements[j].name==name)
					return f.elements[j];
			}
		}
	}
	return null;
}
function findAnchor(name){
	for(i=0;i<document.anchors.length;i++){
		var a = document.anchors[i];
		if(a){
			if(a.name==name)
				return a;
		}
	}
	return null;
}

function moveListItem(fboxNAME, tboxNAME, sListNAME, hiddFFNAME) {
	var fbox = findObject(fboxNAME);
	var tbox = findObject(tboxNAME);
	var sList = findObject(sListNAME);
	var hiddFF = findObject(hiddFFNAME);
	var arrFbox = new Array();
	var arrTbox = new Array();
	var arrLookup = new Array();
	var i;
	for (i = 0; i < tbox.options.length; i++) {
		arrLookup[tbox.options[i].text] = tbox.options[i].value;
		arrTbox[i] = tbox.options[i].text;
	}
	var fLength = 0;
	var tLength = arrTbox.length;
	for(i = 0; i < fbox.options.length; i++) {
		arrLookup[fbox.options[i].text] = fbox.options[i].value;
		if (fbox.options[i].selected && fbox.options[i].value != "") {
			arrTbox[tLength] = fbox.options[i].text;
			tLength++;
		}else {
			arrFbox[fLength] = fbox.options[i].text;
		fLength++;
	   }
	}
	arrFbox.sort();
	arrTbox.sort();
	fbox.length = 0;
	tbox.length = 0;
	var c;
	for(c = 0; c < arrFbox.length; c++) {
		var no = new Option();
		no.value = arrLookup[arrFbox[c]];
		no.text = arrFbox[c];
		fbox[c] = no;
	}
	for(c = 0; c < arrTbox.length; c++) {
		if (arrLookup[arrTbox[1]]=='*') continue;
		if (arrLookup[arrTbox[c]]=='NIL@') continue;
		var no = new Option();
		no.value = arrLookup[arrTbox[c]];
		no.text = arrTbox[c];
		tbox[c] = no;
	}
	var ffVal ="";
	if (sList.options.length){
		var ffVal = sList.options[0].value+'';
		for(j=1;j<sList.options.length;j++){
			ffVal+='^'+sList.options[j].value;
		}
	}
	hiddFF.value=ffVal;
}

function SelectAll(mm,target, val, b1, b2, alist, slist){
	if (mm.checked){
		if(slist){
			if(slist.options){
				if(slist.options.length){
					for( i=0;i<slist.options.length;i++){
						slist.options[i].selected=true;
					}
					moveListItem(slist.name, alist.name, slist.name, target.name);
				}
			}
		}
		slist.options[0] = new Option(val,val);
		target.value=val+'';
		b1.disabled=true;
		b2.disabled=true;
	} else {
		slist.options[0] = null;
		b1.disabled=false;
		b2.disabled=false;
		target.value='';
	}
}

function putArrayTo2List(a, sList, aList, resetF, remove, notVal){
	var a2 =a;
	var c =0;
	var exceptVal ="";
	if (notVal){
		exceptVal = notVal+"";
	}
	if(aList.length){
		for(i=aList.length-1;i>=0;i--){
			aList.options[i] = null;
		}
	}
	
	if (remove){
		if(sList.length){
			for(i=sList.length-1;i>=0;i--){
				if(sList.options[i].value=='*') break;
				sList.options[i] = null;
			}
		}
		resetF.value ='';
	}else {
		if(sList.length){
			for(i=sList.length-1;i>=0;i--){
				if( (sList.options[i].value==exceptVal) && 
					(exceptVal!='*') ){
					sList.options[i] = null;
				}
			}
		}
		if(a){
			a2 = new Array(0);
			if(a.length){
				var c=0;
				for(i=0;i<a.length;i++){
					var j=0;
					for(j=0;j<sList.length;j++){
						if(sList.options[j].value==a[i][0]) break;
					}
					if( (j==sList.length) && (a[i][0]!="*") &&
							 (a[i][0]!=exceptVal) ){
						a2[c] = new Array(2);						
						a2[c][0]=a[i][0];
						a2[c][1]=a[i][1];
						c++;
					}
				}
			}
		}
	}
	if (a2){
		if(a2.length){
			var ff=0;
			for(i=0;i<a2.length;i++){
				if ((a2[i][0]!="*") && (a2[i][0]!=exceptVal) ){
					aList.options[ff] = new Option(a2[i][1],a2[i][0]);
					ff++;
				}
			}
		}
	}
	sortList(aList);
	sortList(sList);
}

function checkUserName(v){
	var dd = v.value+'@';
	if(dd=='@') return true;
	var ii = dd.indexOf(' ');
	if (ii<=0) {
		var tname = dd.substring(0, dd.length-1);
		for(jj=0; jj<SSORestictedNameChars.length; jj++){
			if (tname.indexOf(SSORestictedNameChars[jj])>=0) return false;
		}
		if(tname.charAt(tname.length-1)==','){
			return false;
		}
		var y = tname.charAt(0); 
		if( (y!='\'') && ( (y<'A') || (y>'z'))){
			return false; 
		}
		return true;
	}
	ii = dd.indexOf(', ');
	if (ii<=0){
		return false;
	}
	if( (dd.charAt(ii+2)==' ') || 
		(dd.charAt(ii-1)==' ') ) return false;
	if((ii+2)==dd.indexOf('@')){
		return false;
	}
	var sname = dd.substring(0,ii);
	var gname = dd.substring(ii+2,dd.length-1);
	for(kk = 0;kk<SSORestictedNameChars.length;kk++){
		if (gname.indexOf(SSORestictedNameChars[kk])>=0) return false;
	}
	var nameList = new Array(6);
	nameList[0]=sname;
	var index=0;
	var index2=0;
	var nameCount=1;
	for(o=0;index>=0;o++){
		index2=gname.indexOf(' ',index+1);
		if(index2>=0){
			nameList[nameCount]=gname.substring(index, index2);
			nameCount++;
			index2=index2+1;
		}else if(index>0){
			nameList[nameCount]=gname.substring(index);
		}
		index=index2;
	}
	for(y =0;y<nameList.length;y++){
		if( (nameList[y]) && (nameList[y]!=null)){
			var tmpStr = nameList[y]+'';
			var f = tmpStr.charAt(0); 
			if( (f!='\'') && ( (f<'A') || (f>'z'))){
				return false; 
			}
		}
	}
	return true;
}
function ResetSearchForm(){
	var items = ResetSearchForm.arguments;
	var setValue ='*';
	
	for(i=0;i<items.length;i++){
		if (items[i]){
			if (items[i].options){
				if (items[i].options[0]){
					items[i].options[0].value=setValue;
					items[i].options[0].selected=true;
				}
			}else if (items[i].value){
				items[i].value=setValue;
			}else if(i==0){
				setValue = items[0]+'';
			}
		}
	}
}

function removeFormList(targetList, val){
	if(targetList){
		if(targetList.options){
			var found = 0;
			for(i=0; i<targetList.options.length;i++){
				if (targetList.options[i].value==val){
					targetList.options[i] = null;
					found = 1;
					break;
				}
			}
			if(found==1){
				sortList(targetList);
			}
		}
	}
}
function checkIsDigit(val){
	var old = '1'+val+'';
	if(old=='') return true;
	var tt = parseInt(old)+'';
	return (tt == old);
}

function findHTMLObject(name){
	var formList = document.forms;
	var eList ;
	var i=0;
	var j=0;
	for(i=0;i<formList.length;i++){
		eList = formList[i].elements;
		for(j=0;j<eList.length;j++){
			if(eList[j]){
				if(eList[j].name==name){
					return eList[j];
				}
			}
		}
	}
	return false;
}

function checkAfterToday(d, m, y){
	today= new Date();	
	var tY = today.getFullYear();
	var tM = today.getMonth()+1;
	var tD = today.getDate();
	if (y<tY){
		return false;
	}
	if (y>tY){
		return true;
	}
	if(m<tM){
		return false;
	}
	if(m>tM){
		return true;
	}
	return (d>=tD);
}
var progressEnd = 18;		// set to number of progress <span>'s.
var progressColor = 'blue';	// set to progress bar color
var progressColors = new Array('blue','red');	// set to progress bar color
var progressColorsIn = 0;	// set to progress bar color
var progressInterval = 800;	// set to time between updates (milli-seconds)

var progressAt = 0;
var progressTimer;
function progress_clear() {
	for (var i = 1; i <= progressEnd; i++) document.getElementById('progress'+i).style.backgroundColor = 'transparent';
	progressColorsIn = progressColorsIn ==0 ? 1:0;
	progressColor = progressColors[progressColorsIn];
	progressAt = 0;
}
function progress_update() {
	progressAt++;
	if (progressAt > progressEnd) progress_clear();
	else document.getElementById('progress'+progressAt).style.backgroundColor = progressColor;
	progressTimer = setTimeout('progress_update()',progressInterval);
}
function progress_stop() {
	clearTimeout(progressTimer);
	progress_clear();
}

function startProgressbar(){
	document.all.SSOPROGRESSBAR.className='show';
	for (var i = 1; i <= progressEnd; i++) {
		document.getElementById('progress'+i).className = 'show';
	}
	if (document.all) {	// Internet Explorer
		var offwide= 390;
		if (document.all.SSOPROGRESSBAR.offsetWidth){
			offwide = document.all.SSOPROGRESSBAR.offsetWidth;
		}
		if(document.all.SSOPROGRESSBAR.style){
			document.all.SSOPROGRESSBAR.style.left = 
					(document.body.clientWidth/2) - (offwide/2);
		}
	} else if (document.layers) {	// Netscape
		document.SSOPROGRESSBAR.visibility = true;
		document.SSOPROGRESSBAR.left = (window.innerWidth/2) - 100;
	}
	document.getElementById('progress1').style.backgroundColor = progressColor;
	document.getElementById('progress2').style.backgroundColor = progressColor;
	progressAt = 2;
	progressTimer = setTimeout('progress_update()',300);
}

function submitActionForm(){
	disableAllbutton();
	startProgressbar();
}

function disableAllbutton(){
	var formList = document.forms;
	var eList ;
	var i=0;
	var j=0;
	for(i=0;i<formList.length;i++){
		eList = formList[i].elements;
		for(j=0;j<eList.length;j++){
			if(eList[j]){
				var ttpye = eList[j].type+'';
				if(ttpye=='button'){
					eList[j].disabled=true;
				}
			}
		}
	}
	return false;
}

