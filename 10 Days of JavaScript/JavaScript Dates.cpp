

// The days of the week are: "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
function getDayName(dateString) {
    let date=new Date(dateString);
    let day=date.getDay();
    let dayName=['Sunday','Monday','Tuesday','Wednesday','Thursday','Friday','Saturday'];
    
    
    // Write your code here
    
    return dayName[day];
}

