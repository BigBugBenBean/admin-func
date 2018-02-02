import { applyMiddleware, createStore, compose } from 'redux';
import immutableStateInvariant from 'redux-immutable-state-invariant';
import thunk from 'redux-thunk';
import { createBrowserHistory } from 'history';
import { routerMiddleware } from 'react-router-redux';
import makeRootReducer from './makeRootReducer';
import { composeWithDevTools } from 'redux-devtools-extension';
import logger from 'redux-logger';

const history = createBrowserHistory();
const router = routerMiddleware(history);
const immutable = immutableStateInvariant();

// const logger = createLogger({});

const middleware =
  process.env.NODE_ENV !== 'production'
    ? [
      immutable, 
      router, 
      thunk, 
      logger,
    ]
    : [
      router, 
      thunk
    ];

    const withReduxDevTools = typeof window !== 'undefined' && window.devToolsExtension;

    const composeEnhancers = withReduxDevTools ? composeWithDevTools : compose;
// const composeEnhancers = process.env.NODE_ENV === 'development' ? composeWithDevTools : compose;

const enhancer = composeEnhancers(applyMiddleware(...middleware));

const configureStore = initialState => {
  const store = createStore(
    makeRootReducer(),
    initialState,
    enhancer
  );

  store.asyncReducers = {};

  return store;
};

export default configureStore;