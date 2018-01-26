

// import * as redux from 'redux';
// import * as reactRouterDom from 'react-router-dom'
// import React from 'react'

// import thunk from 'redux-thunk';

import axios from 'axios';

// import { ACTION_TYPE } from './enum';
// import * as ENUM from './enum';
// export const environment = ENUM.ENV.DEV;
// const config = require('./env.json')[environment];
// const config = require('./env.js');

// let logger = require('js-logging').console();

export var isLogined = false;
export var contextPath = '/adminfunc';

export var config = require('../config/env.js');

export const HTTP_METHOD = {
    GET: 'get',
    POST: 'post',
}

// export function getBaseURL() {
//     const baseURL = config.host + ':' + config.port;
//     console.log(baseURL);
//     return baseURL;
// }

// export function getConfig() {
//     console.log('getConfig');
//     console.log(config);
// }

export function log(msg) {
    if (true) {
        // console.log('----------1-----------');
        // console.log(config);
        // console.log('----------2-----------');
        console.log(msg);
    }
}

function errorHandler(error) {
    log('error: ' + JSON.stringify(error));

    return error;
}

/**
 * callAPI provides RESTful common function
 * 
 * 
 * @param String url 
 * @param HTTP_METHOD method 
 * @param Object params Request Params
 * 
 * @returns if Success without Error or Exception:
 *  {
 *      message: [],
 *      data: <Response Object, Array of Result OR Result Object >
 * }
 * if Validation failed:
 *  {
 *      message: [
 *         {<Error Field Name> : 
 *          {   
 *              ErrorType: <Error/Warning/Inform>,
 *              ErrorCode: <Error Code Value>,
 *              MessageCode: <Message Code Value>
 *          }
 *         }
 *      ],
 *      data: {}
 * }
 */
export const callAPI = function(url, method, params) {
    return new Promise(function(resolve, reject) {
        log('callAPI');
        log('url: ' + url);
        log('method: ' + method);
        log('params: ' + params);
        switch (method) {
            case HTTP_METHOD.GET: {
                axios.get(url)
                .then(response => {
                    // let responseJSON = {
                    //     status: {
                    //         message: 'message',
                    //         code: 100
                    //     },
                    //     data: response
                    // }

                    
                    resolve(response);


                })
                .catch(error => {
                    reject(errorHandler(error));
                });
                break;
            }
            case HTTP_METHOD.POST: {
                break;
            }
            default: {
                break;
            }
        }
    });
}



// export function callAPI2(url, method, successCallback, errorCallback) {
//     axios.get(url)
//     .then(response => {
//         console.log('jaksfdlkajsdkfl');
//         // dispatch({
//         //     type: 'okokok',
//         //     payload: response
//         // })
//     })
//     .catch(error => {
//         console.log('errrrrr: ' + error);
//     });
// }

// export const myPromise = new Promise(function(resolve, reject) {

//     if (true) {
//         resolve('fine');
//     } else {
//         reject('errrrrrrrrr');
//     }
// });

// export function callAPI() {
//     const success = (result) => {
//         dispatch({
//             type: 'CREATE_POST_SUCCESS',
//             pyalod: result
//         })
//         return result;
//     }

//     const fail = (error) => {
//         dispatch({
//             type: 'CREATE_POST_FAIL',
//             error
//         })
//     }

//     return async dispatch => {
//         try {
//             const result = await axios.get('https://jsonplaceholder.typicode.com/posts');
//             return success(result);
//         } catch (error) {
//             return fail(error);
//         }
//     }
// }