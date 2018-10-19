import VueI18n from "vue-i18n";
import messages from "src/i18n";

export default ({ app, Vue }) => {
  Vue.use(VueI18n);

  // Set i18n instance on app
  app.i18n = new VueI18n({
    locale: "vi-vn",
    fallbackLocale: "vi-vn",
    messages
  });
  // register change locale method
  app.store.$locale = {
    changeLocale(lang) {
      app.i18n.locale = lang;
    }
  };
  app.store.state.languages.$locale = {
    getLocale() {
      return app.i18n.locale;
    }
  };
};
