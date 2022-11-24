<template>
  <div>
    <ul>
      <li v-on:click="optItem(index)" v-for="(item,index) in sendlist" :key="index">
        {{ item }}
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: "TheList",
  props: {
    sendlist:{
      required:true,
      type:Array
    },
    opttype:{
      type:Boolean,
      required: true
    }
  },
  methods:{
    optItem:function(i){
      if(this.opttype)
        this.$emit("pleaseDelItem",i);
      else
        this.$emit("pleaseMoveItem",i);
    }
  }
}
</script>

<style scoped>

</style>