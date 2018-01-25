import { ACTION_TYPE } from '../../../utils/enum';

import * as util from '../../../utils/util';

const LoginReducer = (initialState, handlers) => {
    return (state = initialState, action) => {
      // util.log('createReducer2');
      // util.log(action.type);
      // util.log(action.payload);
    

      switch(action.type) {
        case ACTION_TYPE.USER_LOGIN: {
          // util.log('----------USER_LOGIN----------');
          // state = {...state, userID: action.payload};
          state = {...state, userID: 'userid123456'};
          // util.log('----------End of USER_LOGIN----------');
          break;
        }
        case ACTION_TYPE.USER_LOGIN_SUCCESS: {
          // util.log('----------USER_LOGIN_SUCCESS----------');
          // state = {...state, userID: action.payload};
          state = {...state, userID: 'userid123456'};
          // util.log('----------End of USER_LOGIN_SUCCESS----------');
          break;
        }
        default: {
          // util.log('----------Default state----------');
          // util.log(state);
          // util.log(action);
          // util.log('----------End of Default state----------');
          return state;
        }
      }


      // if (handlers.hasOwnProperty(action.type)) {
      //   return handlers[action.type](state, action);
      // } else {
      //   return state;
      // }

      return state;
    };
  };
  
  export default LoginReducer;
  