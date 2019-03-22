<template>
    <div id="ShoppingList">
        <h1> Shopping List </h1>
            <ul>
                <li>Eggs</li>
                <li>Bread</li>
                <li>Oatmeal</li>
                <li>Milk</li>
                <li>Banana</li>
                <li>Strawberries</li>
                <li>Lunch Meat</li>
                <li>Grapes</li>
                <li>Steak</li>
                <li>Salad</li>
            </ul>
    </div>
</template>

<script>

export default {

}

</script>

<style>
.shopping-list {
    width:450px;
    background: #fff;
    margin: 50px auto;
    font-family: 'Roboto Condensed', sans-serif;
    border-radius: 10px;
} 
h1 {
    background:#f2f2f2;
    color:#5c8578;
    padding:10px;
    font-size:24px;
    text-transform: uppercase;
    text-align: center;
    margin-bottom: 0px;
    border-top-left-radius: 10px;
    border-top-right-radius: 10px;
}
ul {
    list-style-type: none;
    margin:0px;
    padding:0px;
} 
li {
    font-size: 24px;
    border-bottom:1px solid #f2f2f2;
    padding:10px 20px;
    background: white;
    
}
li:last-child{
    border:0px;
    border-bottom-left-radius: 10px;
    border-bottom-right-radius: 10px;
}
li.completed {
    text-decoration: line-through;
    color:darkgrey;
}
</style>
