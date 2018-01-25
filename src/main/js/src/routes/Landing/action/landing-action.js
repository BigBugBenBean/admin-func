
import { push } from 'react-router-redux';
// import { combineReducers } from 'redux';
// import { Redirect } from 'react-router-dom'

import history from '../../../utils/history';

import { ACTION_TYPE } from '../../../utils/enum';
import * as util from '../../../utils/util';


export const onLogoutClicked = () => {
    return (dispatch, getSelection) => {
        dispatch({
            type: ACTION_TYPE.LANDING_MAIN_PAGE,
            payload: {}
        });

        util.isLogined = false;
        history.push(util.contextPath + '/');

    };
}

// export const dispatchLogout = () => {
//     util.log('dispatchLogout');

//     return (dispatch, getSelection) => {
//         dispatch({
//             type: 'ACTION_TYPE.LANDING_MAIN_PAGE',
//             payload: {}
//         });
//     };
// }