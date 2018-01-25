import { ACTION_TYPE } from '../../../utils/enum';

import * as util from '../../../utils/util';

const LandingReducer = (initialState, handlers) => {
    return (state = initialState, action) => {

      switch(action.type) {
        case ACTION_TYPE.LANDING_MAIN_PAGE: {
          // state = {...state, userID: action.payload};
          

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


      return state;
    };
  };
  
  export default LandingReducer;
  