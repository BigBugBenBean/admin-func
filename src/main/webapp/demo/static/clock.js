var currentTime=-1;
var mydate=new Date();
var dayarray=new Array("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
var montharray=new Array("January","February","March","April","May","June","July","August",
					"September","October","November","December");

function initTime(tt){
	currentTime = tt;
	getthedate();
	ssoDateStart();
}
function getthedate(){
	currentTime=currentTime+1000;
	mydate.setTime(currentTime);
	var year=mydate.getYear();
	if (year < 1000){
		year+=1900;
	}
	var day=mydate.getDay();
	var month=mydate.getMonth();
	var daym=mydate.getDate();
	if (daym<10){
		daym="0"+daym;
	}
	var hours=mydate.getHours();
	if (hours<10){
		hours="0"+hours;
	}
	var minutes=mydate.getMinutes();
	if (minutes<10){
		minutes="0"+minutes;
	}
	var seconds=mydate.getSeconds();
	if (seconds<10){
		seconds="0"+seconds;
	}

//change font size here
	var cdate='<b>'+dayarray[day]+", "+daym+" "+montharray[month]+" "+year+"</b> | <b>"+
					hours+":"+minutes+":"+seconds+'</b>';
	document.getElementById("SSOCLOCKSPAN").innerHTML=cdate;
}

function ssoDateStart(){
	if (document.all||document.getElementById){
		setInterval("getthedate()", 1000);
	}
}
