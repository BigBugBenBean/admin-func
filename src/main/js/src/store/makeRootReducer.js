import { combineReducers } from 'redux';
import { routerReducer } from 'react-router-redux';

const makeRootReducer = asyncReducers => {
  return combineReducers({
    router: routerReducer,
    ...asyncReducers
  });
};

export default makeRootReducer;

export const injectReducer = (store, { key, getReducer }) => {
  if (Object.hasOwnProperty.call(store.asyncReducers, key)) {
    return;
  }

  getReducer()
    .then(reducer => {
      store.asyncReducers[key] = reducer.default;
      store.replaceReducer(makeRootReducer(store.asyncReducers));
    })
    .catch(err => console.error(err));
};
