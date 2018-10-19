export default ({ app, Vue }) => {
  Vue.prototype.authentication = {
    googleLogin(refElement, successCallBack, errorCallBack) {
      console.log(app.store.state);
      return window.gapi.load("auth2", function() {
        // Retrieve the singleton for the GoogleAuth library and set up the client.
        var auth2 = window.gapi.auth2.init({
          client_id: app.store.state.config.google_client_id,
          cookiepolicy: "single_host_origin"
          // Request scopes in addition to 'profile' and 'email'
          //scope: 'additional_scope'
        });
        attachSignin(auth2, refElement.$el, successCallBack, errorCallBack);
        return auth2;
      });
    }
  };
};

function attachSignin(auth2, element, successCallBack, errorCallBack) {
  auth2.attachClickHandler(
    element,
    {},
    function(googleUser) {
      successCallBack(googleUser);
    },
    function(error) {
      errorCallBack(error);
    }
  );
}
