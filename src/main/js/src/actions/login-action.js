import { ACTION_TYPE } from '../common/enum'

export const doLogin = (user) => {
    console.log('doLogin');
    console.log(user);
    return {
        type: ACTION_TYPE.USER_LOGIN,
        payload: user
    }
}