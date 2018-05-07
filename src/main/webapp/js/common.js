
const dateFormat = 'dddd, D MMMM YYYY';
var UI_DATE_FORMAT = "DD/MM/YYYY";
var UI_TIME_FORMAT = "HH:mm:ss";
var TABLE_DATE_FORMAT = "DD/MM/YYYY HH:mm:ss";
var REGEX_DDMMYYY = /^\d{2}\/\d{2}\/\d{4}$/;    // dd/mm/yyyy
const GRID_TABLE_OFFSET = 1;
const GRID_RECORD_PER_PAGE_ARRAY_DEFAULT = [10, 20, 50];

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

commonHeader = function () {
    return "<div>" + ( (this.title === undefined || this.title === null) ? this.name : this.title ) + '</div>';
};

/**
 *
 * @param date: dd/mm/yyyy
 * @param hour: 00-23
 * @param minute: 00-59
 */
function getDateFromInput(date, hour, minute) {
    var newDate = null;

    if(isNotEmptyNullUndfined(date) && isNotEmptyNullUndfined(hour) && isNotEmptyNullUndfined(minute)) {
        if ( isValidDateFormat(REGEX_DDMMYYY, date) && isHour(hour) && isMinute(minute) ) {
            var dateStr = date + ' ' + hour + ':' + minute;
            newDate = new Date(dateStr);
            if (isNotEmptyNullUndfined(newDate)) {
                return newDate;
            }
        }
    }

    return newDate;
}

function isValidDateFormat(reg, dateStr) {
    var isValid = false;
    if (dateStr.match(reg)) {
        isValid = true;
    }
    return isValid;
}

function isHour(value) {
    var isValid = false;

    if (jQuery.isNumeric(value)) {
        if (value >= 0 && value < 24) {
            isValid = true;
        }
    }
    return isValid;
}

function isMinute(value) {
    var isValid = false;

    if (jQuery.isNumeric(value)) {
        if (value >= 0 && value < 59) {
            isValid = true;
        }
    }
    return isValid;
}

function generateSelectOptionByValue(element, list, hasEmpty) {
    var elementStr = '';

    if (hasEmpty) {
        elementStr += '<option value="" selected="selected" ></option>';
    }

    for(var i=0; i < list.length; i++) {
        var tmpVal = list[i];
        var tmpSelectStr = '';
        if (i === 0 && !hasEmpty) {
            tmpSelectStr = ' selected="selected" ';
        }
        elementStr += '<option value="' + tmpVal + '" ' + tmpSelectStr + '>' + tmpVal + '</option>';
    }

    element.html(elementStr);
    // return element;
}

function generateSelectOptionBySequence(element, size, valueOffset) {
    var elementStr = '';

    for(var i=0; i < size; i++) {
        var tmpVal = i + valueOffset;
        var tmpSelectStr = '';
        if (i === 0) {
            tmpSelectStr = ' selected="selected" ';
        }
        elementStr += '<option value="' + tmpVal + '" ' + tmpSelectStr + '>' + tmpVal + '/' + size + '</option>';
    }

    element.html(elementStr);
    // return element;
}

function getGridPageNumSize(recordPerPage, listSize) {
    recordPerPage = parseInt(recordPerPage, 10);
    listSize = parseInt(listSize, 10);

    var size = Math.ceil(listSize/recordPerPage);

    // console.log('recordPerPage: ' + recordPerPage + ' , listSize: ' + listSize);
    // console.log('getGridPageSize: ' + size);

    return size;
}

function bindTabChange(selector, func){
    $(selector + " input[type='radio']").bind("change", func);
}

function onSubCatSelected(event){
    var ele = event.target;
    var data = $(ele).attr("data").split("_");
    var systemCat = data[0], subCat = data[1];
    $('.' + systemCat + 'SubCat').html(subCat);
}

function onMainCatSelected(event) {
    var ele = event.target;
    var val = $(ele).val();
    $("#sub-tab-" + val +"-1").change().prop( "checked" , "checked");
}

function createThymeleafForm(method, path, inputParams) {
    var form = jQuery('<form style="display: none;" method="method" th:action="@{' + path + '}"></form>');

    jQuery.each(inputParams, function (key, value) {
        console.log('key: ' + key + ' , value: ' + value);

        var input = jQuery('<input name="' + key + '" value="' + value + '" />');
        form.append(input);
    });

    return form;
}

function getContextPath() {
    var link = window.location.href;

    var tmpArr = link.split('://');
    var http = tmpArr[0];
    var pathArr = tmpArr[1].split('/');
    var contextPath = http + '://' + pathArr[0] + '/' + pathArr[1];

    return contextPath;
}

function navigatePage(page, hasValue) {
    // console.log('navigatePage');
    console.log('navigatePage_hasVal: ' + hasValue + ' , page: ' + page);

    var append = '';
    if (hasValue == true) {
        append = '#' + page;
    }

    // var link = window.location.href;
    // console.log('link: ' + link);
    //
    // var tmpArr = link.split('://');
    // var http = tmpArr[0];
    // var pathArr = tmpArr[1].split('/');

    var contextPath = getContextPath();

    var menu = 'landing.do';
    var path = contextPath + '/' + menu + append;
    console.log(path);

    window.location.href = path;
    // window.location.href = "http://localhost:8080/adminfunc/landing";

}

function updateNavTitle() {
    $('#eServices2SubCat').html(eServices2SelectedSubCat);
    $('#smartics2SubCat').html(smartics2SelectedSubCat);
    $('#rmSubCat').html(rmSelectedSubCat);
}

function isNotEmptyNullUndfined(obj) {
    return ( (obj != null) && (obj !== '') && (obj !== 'undefined') );
}


$(function () {
    $('#todayDate').html(today);
});