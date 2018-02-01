$(function() {

});

function login() {
    console.log('login');
    // alert('login');

    var ctx = window.location;
    alert(ctx);

    let requestUrl =  '' + '/result';
    alert(requestUrl);
    try{
        $.post(
            {
                url: 'result',
                success: function(data){
                   alert('ok');
                   alert(data);
                },
                error: function(xhr, ajaxOptions, thrownError){
                    alert("Error in displaying rights");
                    console.log("Error in displaying rights");
                }
            });
    }catch(e){
        alert("Error in displaying rights");
        console.log("Error in displaying rights");
    }
}