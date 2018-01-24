import React from 'react';

import { injectReducer } from '../../store/makeRootReducer';

const landingRoute = store => {
  const getComponent = () => {
    return import('./container/landing-container');
  };

//   const getReducer = () => {
//     return import('../../reducers');
//   };

//   injectReducer(store, { key: 'landing', getReducer });

  return getComponent;
};

export default landingRoute;