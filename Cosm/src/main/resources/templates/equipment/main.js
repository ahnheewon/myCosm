url="http://localhost:8081/java/freeBoard/ajax/list"
fetch(url) // post면 url, {post설정옵션} 넣어주세요.
.then(res=>res.json())
.then(obj=>{
    console.log(obj);
    grid.resetData(obj);
})

const grid = new tui.Grid({
    el: document.getElementById('grid'),
    scrollX: false,
    scrollY: false,
    columns: [
    {
        header: 'bno',
        name: 'bno'
    },
    {
        header: 'title',
        name: 'title'
    },
    {
        header: 'contents',
        name: 'contents'
    },
    {
        header: 'writer',
        name: 'writer'
    },
    {
        header: 'regdate',
        name: 'regdate'
    }
    ]
});