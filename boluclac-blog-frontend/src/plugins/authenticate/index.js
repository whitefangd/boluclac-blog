import { mapActions, mapGetters } from "vuex";
import { GoogleAuth } from "./google-auth";
import { NormalAuth } from "./normal-auth";

export default ({ app, Vue }) => {
  Vue.prototype.authentication = new GoogleAuth(
    app.store.state.config.google_client_id
  );
  Vue.mixin({
    data() {
      return {
        authentication: {
          google: new GoogleAuth(this.getGoogleClientId()),
          normal: new NormalAuth()
        }
      };
    },
    methods: {
      ...mapGetters({
        getGoogleClientId: "config/getGoogleClientId"
      })
    }
  });
};
