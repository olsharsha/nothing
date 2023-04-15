const gameContainer=document.querySelector(".container"),
userResult=document.querySelector(".user_result img"),
cpuResult=document.querySelector(".cpu_result img"),
result=document.querySelector(".result"),
optionImages=document.querySelectorAll(".option_image");

//Loop through each option image content
optionImages.forEach((image, index) => {
    image.addEventListener("click", (e) => {
        image.classList.add("active");

        userResult.src = cpuResult.src = "images/rock.png"
        //Loop through each option image again
        optionImages.forEach((image2, index2) =>{
            //if currecnt index not equal to clicked index
            //Remove the 'active status'
            index !== index2 && image2.classList.remove("active");
        });

        gameContainer.classList.add("start");

        result.textContent="wait...";

        let time=setTimeout(()=> {

            gameContainer.classList.remove("start");
            let imageSrc=e.target.querySelector("img").src;
            userResult.src=imageSrc;

        //generate random number between 0 and 3
        let randomNumber= Math.floor(Math.random() * 3);

        //create an array of CPUimages
        let CPUimages=["images/rock.png", "images/paper.png", "images/scissors.png"];
        cpuResult.src=CPUimages[randomNumber];
        //Assign a letter value to cpu options 
        let cpuValue = ["R", "P", "S"][randomNumber];
        let userValue = ["R", "P", "S"][index];
        let outcomes={
            RR: "Draw",
            RP: "WON",
            RS: "LOSE",
            PR: "LOSE",
            PP: "Draw",
            PS: "WON",
            SS: "Draw",
            SP: "LOSE",
            SR: "WON"
        };
        
        let outcomeValue = outcomes[cpuValue + userValue];
        result.textContent= userValue==cpuValue ? "Match Draw" : `YOU ${outcomeValue} !!`; 
        }, 2500)
    });
});

