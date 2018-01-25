import React from 'react';

import { injectReducer } from '../../store/makeRootReducer';

import * as util from '../../utils/util';

const loginRoute = store => {
  const getComponent = () => {
    return import('./container/login-container');
  };

  const getReducer = () => {
    return import('../../reducers');
  };

  injectReducer(store, { key: util.USER_LOGIN_MAIN_PAGE, getReducer });

  return getComponent;
};

export default loginRoute;