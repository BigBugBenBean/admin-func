
import { push } from 'react-router-redux';
import { combineReducers } from 'redux';

import { Redirect } from 'react-router-dom'

import history from '../../../utils/history';
// import * as loginAction from '../action/login-action.js';

// import * as util from '../../../utils/';
// require('../../../utils/');

import axios from 'axios';

// ------------------------------------
// Constants
// ------------------------------------
// export const USER_AUTH = 'USER_AUTH'
// export const AUTH_SUCCESS = 'AUTH_SUCCESS'

import { AUTH_ACTION } from '../../../utils/enum';
import * as util from '../../../utils/';


// import 'whatwg-fetch';

// ------------------------------------
// Actions
// ------------------------------------
//export function handleLogin (e) {
//  e.preventDefault();
//  let username = e.target.form.username.value;
//  let password = e.target.form.password.value;

// export const handleLogin = (username, password) => {
//   return {
//     type    : 'USER_AUTH',
//     payload : {
//       username: username,
//       password: password
//     }
//   }
// }

// export function handleLogin(proxy) {
//  return {
//    type: AUTH_SUCCESS,
//    payload: {
//      username: proxy.target.form.username.value,
//      password: proxy.target.form.password.value

//    }
//  }
// }



export const dispatchLogin = (e) => {
    console.log("dispatchLogin");
//  let that = this.props;
//  const h = this.props.history;
    const username = e.target.form.username.value;
    const password = e.target.form.password.value;

    console.log('username: ' + username + ' , pwd: ' + password);

    // let a = util.getBaseURL();



    // return util.callAPI();

    // util.myPromise.then((val) => {
    //     console.log('123123: '+val);
    // }).catch((err) => {
    //     console.log('errrr: '+err);
    // });

    // util.callAPI('https://jsonplaceholder.typicode.com/posts', util.HTTP_METHOD.GET)
    // .then(result => {
    //     console.log('response');
    //     console.log(result);
    // })
    // .catch(error => {
    //     console.log('error: ' + JSON.stringify(error));
    // });

    let URL = 'https://jsonplaceholder.typicode.com/posts';

    // console.log(history);
    // history.push('landing');

    return (dispatch, getSelection) => {
        // return () => {
        // }

        // temp
        util.isLogined = true;
        dispatch({
            type: AUTH_ACTION.LOGIN_SUCCESS,
            payload: {
                user: {
                    id: '678',
                    password: '654'
                }
                // userID: '678',
                // password: '123123',
                // login: '111222333'
            }
        });
        history.push(util.contextPath + '/eservicesmenu');

        // util.callAPI(URL, util.HTTP_METHOD.GET)
        // .then(result => {
        //     console.log('response');
        //     console.log(result);

        //     util.isLogined = true;
        //     util.log('isLogined: ' + util.isLogined);

        //     dispatch({
        //         type: AUTH_ACTION.LOGIN_SUCCESS,
        //         payload: {
        //             user: {
        //                 id: '678',
        //                 password: '654'
        //             }
        //             // userID: '678',
        //             // password: '123123',
        //             // login: '111222333'
        //         }
        //     });
        //     history.push(util.contextPath + '/applicationfeeenquiry');
            
        // })
        // .catch(error => {
        //     console.log('error: ' + JSON.stringify(error));
        // });

        // return util.callAPI2('https://jsonplaceholder.typicode.com/posts', util.HTTP_METHOD.GET);
    }

    /**
     * 
     */
    // return (dispatch, getSelection) => {
    //     return axios.get('https://jsonplaceholder.typicode.com/posts')
    //     .then(response => {
    //         dispatch({
    //             type: 'okokok',
    //             payload: response
    //         })
    //     })
    //     .catch(error => {
    //         console.log('errrrrr: ' + error);
    //     });
    // }


    // return (dispatch, getState) => {
    //     console.log("222");
    //     dispatch({

    //     });
    // }


    console.log("111");
//   return (dispatch, getState) => {
//     console.log("222");
//     // dispatch({
//     //        type    : USER_AUTH,
//     //        payload : {
//     //          username: username,
//     //          password: password
//     //        }
//     //      });

//     dispatch(
//         {
//             type: ACTION_TYPE.USER_LOGIN,
//             payload: {
//                 username: username,
//                 password: password
//             }
//         }
//     );

// //     return dispatch(routeActions.push('/counter'));

// //      dispatch({
// //                 type    : 'ADD_TODO',
// //                 payload : 8888
// //               })
//     //   dispatch(
//     //     loginAction(getState().login.username)
//     // );
//       let url = '/todo';
//     //   history.push(url);


// //      getState().router.location = url

// //      dispatch({
// //                 type    : 'ADD_TODO',
// //                 payload : getState().login.username
// //               })
// //    this.context.router.history.push(url)
      
// //      browserHistory.push(url, getState());
// //        h.push(url);s

// //      Case 3.
// //      dispatch({
// //            type: '@@router/LOCATION_CHANGE',
// //            payload: url
// //      })
// //      location.push(url);

// //      return dispatch(push(url));
// //        return (
// //            <Redirect to={from || '/thank-you'}/>
// //        )
//      }
}

//export default  {
//  handleLogin,
//  dispatchLogin
//}
