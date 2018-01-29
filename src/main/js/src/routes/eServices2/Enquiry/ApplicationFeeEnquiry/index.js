import React from 'react';

import { injectReducer } from '../../../../store/makeRootReducer';

import { REDUCER_PAGE } from '../../../../utils/enum';

// import Container from './container/application-fee-enquiry-container';
// import Reducers from '../../../../reducers';



const applicationFeeEnquiryRoute = store => {
    const getComponent = () => {
        // return Container;
        return import('./container/application-fee-enquiry-container');
    };

    const getReducer = () => {
        // return Reducers;
        return import('../../../../reducers');
    };

    injectReducer(store, { key: REDUCER_PAGE.APPLICATION_FEE_ENQUIRY, getReducer });

    return getComponent;
};

export default applicationFeeEnquiryRoute;