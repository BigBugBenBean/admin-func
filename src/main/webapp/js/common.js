
const dateFormat = 'dddd, D MMMM YYYY';

const today = moment().format(dateFormat);

// console.log(today);

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

