import React from 'react';

import { injectReducer } from '../../../store/makeRootReducer';

import { REDUCER_PAGE } from '../../../utils/enum';


const applicationFeeEnquiryRoute = store => {
    const getComponent = () => {
        // return Container;
        return import('./container/e-services-menu-container');
    };

    const getReducer = () => {
        // return Reducers;
        return import('../../../reducers');
    };

    injectReducer(store, { key: REDUCER_PAGE.E_SERVICES_MENU, getReducer });

    return getComponent;
};

export default applicationFeeEnquiryRoute;