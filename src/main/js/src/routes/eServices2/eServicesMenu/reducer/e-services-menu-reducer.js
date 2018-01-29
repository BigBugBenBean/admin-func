import { AUTH_ACTION } from '../../../../utils/enum';

import * as util from '../../../../utils/';

const eServicesMenuReducer = (initialState, handlers) => {
    return (state = initialState, action) => {
        switch(action.type) {
            case AUTH_ACTION.LOGIN_SUCCESS: {
                // state = {...state, user: action.payload};
                //   util.log('----------LOGIN_REQUEST----------');
                //   util.log(action);
                //   util.log('----------End of LOGIN_REQUEST----------');
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

export default eServicesMenuReducer;
  