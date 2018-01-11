     NS4 = (document.layers);
     IE4 = (document.all);
    ver4 = (NS4 || IE4);
	 IE5 = (IE4 && navigator.appVersion.indexOf("5.")!=-1);
   isMac = (navigator.appVersion.indexOf("Mac") != -1);
  isMenu = (NS4 || (IE4 && !isMac) || (IE5 && isMac));
function popUp(){return};
function popDown(){return};
if (!ver4) event=null;



if (isMenu) {
menuVersion = 3;
menuWidth = 120;
childOverlap = 20;
childOffset = 5;
perCentOver = null;
secondsVisible = 0.1;
fntCol = "#FFFFFF";
fntSiz = "11";
fntBold = false;
fntItal = false;
fntFam = "Arial";
backCol = "#FF9801";
overCol = "#FCB54C";
overFnt = "#196AB8";
borWid = 1;
borCol = "#FEE2B2";
borSty = "solid";
itemPad = 3;
imgSrc = "tri.gif";
imgSiz = 10;
separator = 1;
separatorCol = "#FEE2B2";
isFrames = false;
keepHilite = false; 
clickStart = false;
clickKill = false;
}


function addMenu(ssoroot){
	if (isMenu) {
		document.write("<SCRIPT LANGUAGE='JavaScript1.2' SRC='"+
			ssoroot+"hierMenus.js' TYPE='text/javascript'><\/SCRIPT>");
	}
}