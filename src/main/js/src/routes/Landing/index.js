import React from 'react';

import { injectReducer } from '../../store/makeRootReducer';

import * as util from '../../utils/util';

const landingRoute = store => {
  const getComponent = () => {
    return import('./container/landing-container');
  };

  const getReducer = () => {
    return import('../../reducers');
  };

  injectReducer(store, { key: util.LANDING_MAIN_PAGE, getReducer });

  return getComponent;
};

export default landingRoute;