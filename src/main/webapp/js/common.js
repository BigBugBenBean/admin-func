
const dateFormat = 'dddd, D MMMM YYYY';

const today = moment().format(dateFormat);

// console.log(today);

const PAGE_MENU = {
    LOGIN: '/AUTH/login-form.html',
    LANDING: 'landing',
    APPLICATION_FEE_ENQUIRY: 'applicationFeeEnquiry.html'
};

const CAT_MENU = {
    E_SERVICES_2: 0,
    SMARTICS_2: 1,
    RM: 2
};
const SUB_CAT_MENU = {
    ENQUIRY: 'Enquiry',
    MAINTENANCE: 'Maintenance',
    MANAGEMENT: 'Management'
};

var eServices2SelectedSubCat = SUB_CAT_MENU.ENQUIRY;
var smartics2SelectedSubCat = SUB_CAT_MENU.ENQUIRY;
var rmSelectedSubCat = SUB_CAT_MENU.ENQUIRY;

function onEServices2SubCatSelected(subCat) {
    switch (subCat) {
        case SUB_CAT_MENU.ENQUIRY: {
            eServices2SelectedSubCat = SUB_CAT_MENU.ENQUIRY;
            break;
        }
        case SUB_CAT_MENU.MAINTENANCE: {
            eServices2SelectedSubCat = SUB_CAT_MENU.MAINTENANCE;
            break;
        }
        case SUB_CAT_MENU.MANAGEMENT: {
            eServices2SelectedSubCat = SUB_CAT_MENU.MANAGEMENT;
            break;
        }
    }
    $('#eServices2SubCat').html(eServices2SelectedSubCat);
}

function onSmartics2SubCatSelected(subCat) {
    switch (subCat) {
        case SUB_CAT_MENU.ENQUIRY: {
            smartics2SelectedSubCat = SUB_CAT_MENU.ENQUIRY;
            break;
        }
        case SUB_CAT_MENU.MAINTENANCE: {
            smartics2SelectedSubCat = SUB_CAT_MENU.MAINTENANCE;
            break;
        }
        case SUB_CAT_MENU.MANAGEMENT: {
            smartics2SelectedSubCat = SUB_CAT_MENU.MANAGEMENT;
            break;
        }
    }
    $('#smartics2SubCat').html(smartics2SelectedSubCat);
}

function onRmSubCatSelected(subCat) {
    switch (subCat) {
        case SUB_CAT_MENU.ENQUIRY: {
            rmSelectedSubCat = SUB_CAT_MENU.ENQUIRY;
            break;
        }
        case SUB_CAT_MENU.MAINTENANCE: {
            rmSelectedSubCat = SUB_CAT_MENU.MAINTENANCE;
            break;
        }
        case SUB_CAT_MENU.MANAGEMENT: {
            rmSelectedSubCat = SUB_CAT_MENU.MANAGEMENT;
            break;
        }
    }
    $('#rmSubCat').html(rmSelectedSubCat);
}

function onMainCatSelected(cat) {
    switch (cat) {
        case CAT_MENU.E_SERVICES_2: {
            break;
        }
        case CAT_MENU.SMARTICS_2: {
            break;
        }
        case CAT_MENU.RM: {
            break;
        }
    }
    // $.post({
    //     url: '/menu',
    // });
}

function navigatePage(page) {
    console.log('navigatePage: ' + page);

    let formData = {
        firstname: 'alex',
        lastname:  'wong'
    };

    let url = '/adminfunc/navMenu';

    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: url,
        data: JSON.stringify(formData),
        dataType: 'json',
        success: function(result) {
            alert('done: ' + JSON.stringify(result));
            console.log(result);
        },
        error: function(e) {
            alert("Error!");
            console.log("ERROR: ", e);
        }
    })

}

function updateNavTitle() {
    $('#eServices2SubCat').html(eServices2SelectedSubCat);
    $('#smartics2SubCat').html(smartics2SelectedSubCat);
    $('#rmSubCat').html(rmSelectedSubCat);
}