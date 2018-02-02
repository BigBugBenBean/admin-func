import React from 'react';

import { injectReducer } from '../../store/makeRootReducer';

import { REDUCER_PAGE } from '../../utils/enum';

import Container from './container/landing-container';
import Reducers from '../../reducers';



const landingRoute = store => {
  const getComponent = () => {
    // return Container;
    return import('./container/landing-container');
  };

  const getReducer = () => {
    // return Reducers;
    return import('../../reducers');
  };

  injectReducer(store, { key: REDUCER_PAGE.LANDING_PAGE, getReducer });

  return getComponent;
};

export default landingRoute;