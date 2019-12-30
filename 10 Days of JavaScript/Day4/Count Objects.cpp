

/*
 * Return a count of the total number of objects 'o' satisfying o.x == o.y.
 * 
 * Parameter(s):
 * objects: an array of objects with integer properties 'x' and 'y'
 */
function getCount(objects) {
let count=0;
for(let i=0;i<objects.length;i++){
    if(objects[i].x==objects[i].y)
        count++;
}
return count;

}

