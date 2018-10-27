<template>
  <q-list>
    <template v-for="(item, index) in menus" >
      <q-list-header
        v-if="item.header"
        :key="index" >{{ $t(item.title) }}</q-list-header>
      <q-collapsible
        v-else-if="item.menus"
        :key="index"
        :icon="item.icon"
        :label="$t(item.title)" >
        <template v-for="(itemChild, indexChild) in item.menus" >
          <q-item
            :to="itemChild.url"
            :key="indexChild">{{ $t(itemChild.title) }}</q-item>
        </template>
      </q-collapsible>
      <q-item-separator
        v-else-if="item.separator"
        :key="index" />
      <q-item
        v-else
        :to="item.url"
        :key="index">{{ $t(item.title) }}</q-item>
    </template>

  </q-list>
</template>
<script>
export default {
  name: "SideBar",
  props: {
    menus: {
      type: Array,
      required: true,
      default: undefined
    }
  },
  watch: {
    menus(newValue, oldValue) {
      if (newValue != oldValue) {
        this.menus = newValue;
      }
    }
  }
};
</script>
