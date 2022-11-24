<template>
    <div id="add-new">
        <input type="text" v-model="newItem">
        <button @click="handleAdd">添加</button>
    </div>
</template>
<script>
    export default {
        name: 'AddNew',
        data() {
            return {
                newItem: ''
            }
        },
        methods: {
            handleAdd: function() {
                if (this.newItem == '') {
                    alert("不能为空");
                    return;
                }
                this.$emit('submitNewItem', this.newItem);
                this.newItem = '';
            }
        }
    }
</script>
<style scoped>
    input{
        border: none;
        outline: none;
        width: 300px;
        height: 30px;
        border: solid 1px #999;
        border-radius: 5px;
        padding-left: 10px;
    }
    button{
        border: none;
        outline: none;
        width: 80px;
        height: 36px;
        background-color: #42B983;
        border-radius: 5px;
        margin-left: 10px;
        color: #fff;
    }
</style>