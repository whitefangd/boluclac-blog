<template>

  <q-list
    v-if="isLogin"
    link
    class="q-pt-none">
    <q-item
      class="bg-grey-3">
      <q-item-side>
        <q-item-tile avatar>
          <img
            v-if="account.avatar"
            :src="account.avatar" >
          <vue-letter-avatar
            v-else
            :rounded="true"
            :name="account.name"
            size="40" />
        </q-item-tile>
      </q-item-side>
      <q-item-main>
        <q-item-tile label>{{ account.name }}</q-item-tile>
        <q-item-tile
          v-if="account.hideMail"
          sublabel>{{ account.nick }}</q-item-tile>
        <q-item-tile
          v-else
          sublabel>{{ account.mail }}</q-item-tile>
      </q-item-main>
    </q-item>
    <q-list-header>{{ $t('labels.language') }}</q-list-header>
    <q-item
      v-for="item in languages"
      :key="'language-' + item.value"
      tag="label"
      link>
      <q-item-side>
        <q-radio
          v-model="language"
          :val="item.value"
          @input="changeLanguage" />
      </q-item-side>
      <q-item-main :label="$t(item.text)" />
    </q-item>
    <q-item-separator />
    <q-list-header>{{ $t('labels.personal') }}</q-list-header>
    <q-item>
      <q-item-side icon="account_circle" />
      <q-item-main>
        <q-item-tile label>{{ $t('labels.personalinfo') }}</q-item-tile>
      </q-item-main>
      <q-item-side
        right
        icon="keyboard_arrow_right" />
    </q-item>
    <q-item>
      <q-item-side icon="security" />
      <q-item-main>
        <q-item-tile label>{{ $t('labels.security') }}</q-item-tile>
      </q-item-main>
      <q-item-side
        right
        icon="keyboard_arrow_right" />
    </q-item>
    <q-item-separator />
    <q-item>
      <q-item-main>
        <q-item-tile label>{{ $t('labels.logout') }}</q-item-tile>
      </q-item-main>
      <q-item-side
        right
        icon="work_off" />
    </q-item>
  </q-list>

  <q-list
    v-else
    class="q-pt-none">
    <q-list-header>{{ $t('labels.language') }}</q-list-header>
    <q-item
      v-for="item in languages"
      :key="'language-' + item.value"
      tag="label"
      link>
      <q-item-side>
        <q-radio
          v-model="language"
          :val="item.value"
          @input="changeLanguage" />
      </q-item-side>
      <q-item-main :label="$t(item.text)" />
    </q-item>
    <q-list-header>{{ $t('labels.login') }}</q-list-header>
    <q-item>
      <q-item-main>
        <q-input
          v-model="username"
          :float-label="$t('labels.username')"
          type="email" />
      </q-item-main>
    </q-item>
    <q-item>
      <q-item-main>
        <q-input
          v-model="password"
          :float-label="$t('labels.password')"
          type="password" />
      </q-item-main>
    </q-item>
    <q-item>
      <q-item-main>
        <q-btn
          :label="$t('buttons.login')"
          color="primary"
          class=" full-width"
          @click="loginNormal" />
      </q-item-main>
    </q-item>
    <q-item>
      <q-item-main>
        <q-btn
          ref="google-login"
          :label="$t('buttons.login-with-google')"
          icon="fab fa-google"
          color="negative"
          class=" full-width" />
      </q-item-main>
    </q-item>
    <q-item>
      <q-item-main>
        <q-btn
          :label="$t('buttons.login-with-facebook')"
          icon="fab fa-facebook-f"
          color="light-blue-10"
          class=" full-width"
          @click="loginFacebook" />
      </q-item-main>
    </q-item>
    <q-item>
      <q-item-main>
        <q-btn
          :label="$t('buttons.register')"
          color="secondary"
          class=" full-width" />
      </q-item-main>
    </q-item>
  </q-list>
</template>
<script>
import { mapActions, mapGetters } from "vuex";
export default {
  name: "Profile",
  props: {
    account: {
      type: Object,
      required: false,
      default: undefined
    }
  },
  data() {
    return {
      showLoginForm: false,
      username: "",
      password: "",
      language: "",
      languages: [
        {
          value: "vi-vn",
          text: "languages.vi"
        },
        {
          value: "en-us",
          text: "languages.en"
        }
      ]
    };
  },
  computed: {
    ...mapGetters({ isLogin: "account/isLogin" })
  },
  mounted() {
    this.language = this.getLocale();
    this.authentication.googleLogin(
      this.$refs["google-login"],
      this.googleLoginSuccess,
      this.googleLoginFail
    );
  },
  methods: {
    changeLanguage(locate) {
      this.setLocale(locate);
    },
    loginNormal() {},
    loginFacebook() {},

    googleLoginSuccess(googleUser) {
      var authentication = {};
      if (googleUser.isSignedIn()) {
        authentication = googleUser.getAuthResponse(true);
      }
      console.log(authentication);
    },
    googleLoginFail(error) {},
    ...mapGetters({
      getLocale: "languages/getLocale"
    }),
    ...mapActions({
      setLocale: "languages/setLocale"
    })
  }
};
</script>
