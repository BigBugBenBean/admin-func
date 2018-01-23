import { ACTION_TYPE } from '../../../utils/enum';

import * as util from '../../../utils/util';

const createReducer = (initialState, handlers) => {
    util.log('createReducer');
    return (state = initialState, action) => {
      util.log('createReducer2');
      util.log(action.type);
      util.log(action.payload);
    

      switch(action.type) {
        case ACTION_TYPE.USER_LOGIN: {
          util.log('USER_LOGIN_123');
          // state = {...state, userID: action.payload};
          break;
        }
        default: {
          return state;
        }
      }


      // if (handlers.hasOwnProperty(action.type)) {
      //   return handlers[action.type](state, action);
      // } else {
      //   return state;
      // }


    };
  };
  
  export default createReducer;
  