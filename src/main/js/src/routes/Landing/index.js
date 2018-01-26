import React from 'react';

import { injectReducer } from '../../store/makeRootReducer';

import { REDUCER_PAGE } from '../../utils/enum';

import * as util from '../../utils/';

const landingRoute = store => {
  const getComponent = () => {
    return import('./container/landing-container');
  };

  const getReducer = () => {
    return import('../../reducers');
  };

  injectReducer(store, { key: REDUCER_PAGE.LANDING_PAGE, getReducer });

  return getComponent;
};

export default landingRoute;