import React from 'react';

const asyncComponent = getComponent => {
  return class AsyncComponent extends React.Component {
    constructor(props) {
      super(props);

      this.Component = null;

      this.state = {
        Component: AsyncComponent.Component
      };
    }

    componentWillMount() {
      const { Component } = this.state;

      if (!Component) {
        getComponent()
          .then(Component => {
            AsyncComponent.Component = Component.default;

            this.setState({
              Component: Component.default
            });
          })
          .catch(err => console.error(err));
      }
    }

    render() {
      const { Component } = this.state;

      return Component ? <Component {...this.props} /> : null;
    }
  };
};

export default asyncComponent;
