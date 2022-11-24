<template>
    <ol>
        <li v-for="(item,index) in list" :key="index" @click="judgeItem(index)">{{item}}</li>
    </ol>
</template>
<script>
    export default {
        name: "TheList",
        /*
         * props除了使用字符串数组形式，还可以使用对象形式。
         * 这样就可以对传入的数据进行验证。
         * 包括数据类型验证、必填验证、设置默认值等。
         */
        props: {
            list: {
                type: Array,
                required: true,
            },
            listType: {
                type: Boolean,
                default: false,
            }
        },
        methods: {
            judgeItem: function(index) {
                if (!this.listType) {
                    this.$emit("handleJudge", index);
                } else {
                    this.$emit("handleDelete", index);
                }
            }
        }
    }
</script>
<style scoped>
    ol{
        margin-top: 20px;
    }
    ol li{
        cursor: pointer;
    }
</style>