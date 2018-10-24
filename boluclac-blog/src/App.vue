<template>
  <div id="q-app">
    <router-view />
  </div>
</template>

<script>
import constant from "@/common/const";
import { Loading, QSpinnerGears } from "quasar";
import { mapActions, mapGetters } from "vuex";

const URL = constant.URL;

export default {
  name: "App",
  created() {
    Loading.show();
  },
  mounted() {
    var self = this;
    self.initialization();
    Loading.hide();
  },
  methods: {
    initialization() {
      var self = this;
      self.httpGet(URL.CONFIG).then(function(data) {
        self.setConfigLanguages(data.languages);
      });
    },
    ...mapActions({
      setConfigLanguages: "config/setConfigLanguages"
    })
  }
};
</script>

<style>
</style>
