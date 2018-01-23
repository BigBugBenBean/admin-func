import React from 'react';

import { injectReducer } from '../../store/makeRootReducer';

const loginRoute = store => {
  const getComponent = () => {
    return import('./container/login-container');
  };

  const getReducer = () => {
    return import('../../reducers');
  };

  injectReducer(store, { key: 'login', getReducer });

  return getComponent;
};

export default loginRoute;