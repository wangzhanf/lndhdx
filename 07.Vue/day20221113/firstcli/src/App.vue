<template>
    <div id="app">
        <h1>todoList</h1>
        <AddNew @submitNewItem="addNewItem"></AddNew>
        <!-- todo 代办区域 -->
        <TheList @handleJudge="toDone" :list="todoList"></TheList>
        <hr>
        <!-- done 完成区域 -->
        <TheList @handleDelete="toDelete" :list="doneList" :listType="true"></TheList>
    </div>
</template>
<script>
    import AddNew from './components/AddNew';
    import TheList from './components/TheList';
    export default {
        name: "app",
        data() {
            return {
                todoList: [],     //代办事项
                doneList: []      //完成事项
            }
        },
        methods: {
            addNewItem: function(newItem) {
                this.todoList.push(newItem);
            },
            toDone: function(index) {
                this.doneList.push(this.todoList.splice(index, 1)[0])
            },
            toDelete: function(index) {
                this.doneList.splice(index, 1);
            }
        },
        components: {
            AddNew,
            TheList
        }
    }
</script>
