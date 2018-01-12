
var result = {}

var userID = '';
var userPwd = '';
var role ='';



$( document ).ready(function() {
    // console.log( "ready!" );

    

    userID = localStorage.getItem("userID");
    userPwd = localStorage.getItem("userPwd");
    // userID = localStorage.getItem("userID");

    // loadData();

    // updateData();


});

function updateData() {

    $('#displayUserID').html(userID);

    $('#navTitle').html('');
    $('#enquiryTitle').html('Demo - User Login');
    if (result && result.iss3UserSignOnDTO && result.iss3UserSignOnDTO.userEngName){
        $('#displayValue1').html('Username: ' + result.iss3UserSignOnDTO.userEngName);
        $('#displayValue2').html('User ID: ' + userID);
        $('#displayValue3').html('Role: ' + result.iss3UserSignOnDTO.roleCDs[0]);
    }else{
        $('#displayValue1').html('Error Message: Login Failure ');
    }
}

function loadData() {
    var link = '';

    // link = 'https://jsonplaceholder.typicode.com/posts';
    link = window.location.protocol + '//' + window.location.host +'/adminfunc/login/';


    if ( !localStorage.getItem("userID") || ! localStorage.getItem("userPwd" ) )
        return;
    var inputData = {
                    "loginId": localStorage.getItem("userID"),
                    "password": localStorage.getItem("userPwd")
                  };
    var success = function(data, status){
      // console.log('success');
            result = data.responseJSON; /*{
                "userAuthenticateResponse": null,
                "iss3UserSignOnDTO": {
                    "accessibleLocs": [
                        "*"
                    ],
                    "controllerSysIDs": [
                        "CS",
                        "SM"
                    ],
                    "externalUser": false,
                    "forceLogoutTerm": null,
                    "immdToken": "fe4a920a518142f8bac8e2b811719a83",
                    "locID": "",
                    "needToDoLocationSignOn": false,
                    "passwordExpiryDateTime": 1546565687000,
                    "posts": [
                        "IO(ROP)KO"
                    ],
                    "roleCDs": [
                        "IO(ROP)KO"
                    ],
                    "sysIDs": [
                        "CD",
                        "UP",
                        "CS",
                        "SM",
                        "SB",
                        "SQ"
                    ],
                    "userEngName": "CHAN, TAI HING"
                }
            };
            */
            // console.log("Data: " + JSON.stringify(data) + "\nStatus: " + status);
            updateData();
          };
//    $.post(link, inputData, success,"jsonp");


    $.ajax(link,
     {
      method: "POST",
      data: JSON.stringify(inputData),
      error: (e) => {
        console.log(e);

        let errMsg = 'Login Failed';
        
        let errMsg1 = e.responseJSON['fieldErrors'][0]['messageId'];
        let errMsg2 = e['message'];

        if (errMsg1 != null && errMsg1 != 'undefined' && errMsg1 != '') {
            errMsg = errMsg1;
        } else if (errMsg2 != null && errMsg2 != 'undefined' && errMsg2 != '') {
            let tmpStr = errMsg2.split(':')[2];

            errMsg = tmpStr;
        }

        $('#displayValue1').html('Error Message: ' + errMsg);
      },
      success: success,
      headers: {"Content-Type": "application/json"}
      });
}

function goToLogin() {
    console.log('goToLogin');

    let path = './login.html';
    loadPage(path);
}

function goToLanding() {
    console.log('goToLanding');

    userID = $('#userID').val();
    userPwd = $('#userPwd').val();

    localStorage.setItem("userID", userID);
    localStorage.setItem("userPwd", userPwd);

    console.log('userID: ' + userID + ' , userPwd: ' + userPwd);
    
    let path = './landing.html';
    loadPage(path);
}

function loadPage(fileNameWithPath) {
    console.log('loadPage: ' + fileNameWithPath);

    // let filename = page + '.html';

    let width = getScreenWidth();
    let height = getScreenHeight();
    // console.log('w: ' + width + ' , h: ' + height  );

    // let str = '<object type="text/html" data="' + filename + '" style="min-width: ' + width + 'px; min-height: ' + height + 'px; margin-left: -20px; "></object>';
    
    
    window.location.assign(fileNameWithPath);

    // $('#root').html(''+str);
    // document.getElementById('root').innerHTML = str;

    // window.frames['root'].document.body.innerHTML = filename;
}

function getScreenWidth() {
    return $(window).width();
}

function getScreenHeight() {
    return $(window).height();
}

var submitCount = 0;
function submitForm() {
	if (submitCount > 0) return;
	
	var pass = document.forms[0].elements['userpassword'].value;
	var name = document.forms[0].elements['username'].value;	
	
	if (pass == '' || name == '') {
		alert ('Please enter both User ID and Password to login.');
		return;
	}
	document.forms[0].submit();
	submitCount++;
}
function checkEnter( event ) {
  var whichCode = (window.Event) ? event.which : event.keyCode;
//User click Enter
  if ((event.keyCode==13)){
submitForm();
  }
}