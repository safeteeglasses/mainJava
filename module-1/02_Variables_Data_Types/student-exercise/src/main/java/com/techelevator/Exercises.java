package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
		
		System.out.println(remainingNumberOfBirds);
        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		
		System.out.println(numberOfExtraBirds);
        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int numberOfRaccoons = 3;
		int numberGoHome = 2;
		int numberLeft = numberOfRaccoons - numberGoHome;
		
		System.out.println(numberLeft);
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int flowers = 5;
		int bees = 3;
		int lessBees = flowers - bees;
		
		System.out.println(lessBees);
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int lonelyPigeon = 1;
		lonelyPigeon += 1;
		
		System.out.println(lonelyPigeon);
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlsOnFence = 3;
		owlsOnFence += 2;
		
		System.out.println(owlsOnFence);
		
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int busyWorkingBeavers = 2;
		busyWorkingBeavers -= 1;
		
		System.out.println(busyWorkingBeavers);
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansSittingOnTreeLimb = 2;
		toucansSittingOnTreeLimb += 1;
		
		System.out.println(toucansSittingOnTreeLimb);
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrelsInTree = 4;
		int nutsInTree = 2;
		
		System.out.println(squirrelsInTree - nutsInTree);
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		int quarter = 25;
		int nickel = 5;
		int dime = 10;
		
		System.out.println(quarter + (nickel * 2) + dime + " cents");
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int mrsBriersBakedMuffins = 18;
		int mrsMacAdamsBakedMuffins = 20;
		int mrsFlannerysBakedMuffins = 17;
		
		int totalBakedMuffins = mrsBriersBakedMuffins + mrsMacAdamsBakedMuffins + mrsFlannerysBakedMuffins;
		
		System.out.println(totalBakedMuffins + " muffins");
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		int yoyo = 24;
		int whistle = 14;
		
		System.out.println(yoyo + whistle + " cents total");
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int riceKrispieTreats = 5;
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		
		System.out.println(largeMarshmallows + miniMarshmallows);
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int hiltsHouse = 29;
		int brecknockElementarySchool = 17;
		
		System.out.println(hiltsHouse - brecknockElementarySchool + " additional inches of snow");
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int mrsHiltsCash = 10;
		int toyTruck = 3;
		int pencilCase = 2;
		
		System.out.println(mrsHiltsCash - toyTruck - pencilCase + " dollars left");
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int marbleCollection = 16;
		marbleCollection -= 7;
		
		System.out.println(marbleCollection);
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int megansSeashells = 19;
		int meganWishesSheHad = 25;
		int needsToHave = meganWishesSheHad - megansSeashells;
		
		System.out.println(needsToHave + " seashells");
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int bradsBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = bradsBalloons - redBalloons;
		
		System.out.println(greenBalloons + " green balloons");
		
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnShelf = 38;
		booksOnShelf += 10;
		
		System.out.println(booksOnShelf + " books on the shelf");
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int beeLegs = 6;
		
		System.out.println(beeLegs * 8 + " legs");
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double iceCreamCone = .99;
		iceCreamCone *= 2;
		
		System.out.println(iceCreamCone);
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int hasRocksForBorder = 64;
		int needsRocksForBorder = 125;
		
		System.out.println(needsRocksForBorder - hasRocksForBorder + " rocks");
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int mrsHiltsMarbles = 38;
		mrsHiltsMarbles -= 15;
		
		System.out.println(mrsHiltsMarbles + " marbles left");
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int totalMiles = 78;
		
		System.out.println(totalMiles - 32 + " miles to go");
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		double shovelTime = 1.5;
		shovelTime += .75;
		
		System.out.println(shovelTime + " hours");
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		double hotDogsCost = .50;
		hotDogsCost *= 6;
		
		System.out.println(hotDogsCost);
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int mrsHiltTotalMoneyForPencils = 50;
		int pencilCosts = 7;
		
		System.out.println(mrsHiltTotalMoneyForPencils / pencilCosts + " pencils");
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalButterflies = 33;
		int orangeButterflies = 20;
		
		System.out.println(totalButterflies - orangeButterflies + " red butterflies");
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		int kateInitialMoney = 100;
		int candyCost = 54;
		
		System.out.println(kateInitialMoney - candyCost + " cents");
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int marksTrees = 13;
		marksTrees += 12;
		
		System.out.println(marksTrees + " trees");
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int hoursInADay = 24;
		
		System.out.println(hoursInADay * 2 + " hours");
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int kimsCousins = 4;
		kimsCousins *= 5;
		
		System.out.println(kimsCousins + " pieces of gum");
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		int dansMoney = 3;
		int candyBar = 1;
		int moneyLeft = dansMoney - candyBar;
		
		System.out.println(moneyLeft + " dollars left");
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsInTheLake = 5;
		int peopleOnTheBoat = 3;
		
		System.out.println(boatsInTheLake * peopleOnTheBoat + " people");
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int ellensLegos = 380;
		ellensLegos -= 57;
		
		System.out.println(ellensLegos + " legos left");
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int muffinsBaked = 35;
		int neededMuffinsBaked = 83;
		
		System.out.println(neededMuffinsBaked - muffinsBaked + " to go");
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willysCrayons = 1400;
		int lucysCrayons = 290;
		
		System.out.println(willysCrayons - lucysCrayons + " more crayons");
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersOnPage = 10;
		int pagesOfStickers = 22;
		int totalStickers = (stickersOnPage * pagesOfStickers);
		
		System.out.println(totalStickers + " stickers");
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int totalCupcakes = 96;
		totalCupcakes /= 8;
		
		System.out.println(totalCupcakes + " for each child");
		
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int gingerbreadCookies = 47;
		
		System.out.println(47 % 6 + " will not be placed in a jar");
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int mariansTotalCroissants = 59;
		
		System.out.println(59 % 8 + " left with Marian");
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int totalOatmealCookies = 276;
		int cookiesOnATray = 12;
		int totalTraysNeeded = (totalOatmealCookies / cookiesOnATray);
		
		System.out.println(totalTraysNeeded + " trays needed");
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int totalPretzels = 480;
		int servingSize = 12;
		
		System.out.println(totalPretzels / servingSize + " servings");
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCupcakes = 53;
		int cupcakesGivenAway = lemonCupcakes / 3;
		
		System.out.println(cupcakesGivenAway + " boxes");
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int totalCarrotSticks = 74;
		int totalCarrotsUneaten = totalCarrotSticks % 12;
		
		System.out.println(totalCarrotsUneaten + " carrots uneaten");
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int totalTeddyBears = 98;
		int totalShelvesFilled = (totalTeddyBears / 7);
		
		System.out.println(totalShelvesFilled + " shelves filled");
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int totalPictures = 480;
		int albumCanHold = 20;
		int totalAlbumsNeeded = (totalPictures / albumCanHold);
		
		System.out.println(totalAlbumsNeeded + " albums needed");
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int totalTradingCards = 94;
		int boxCanHold = 8;
		
		System.out.println(totalTradingCards % boxCanHold);
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int dadsTotalBooks = 210;
		int totalNumberOfShelves = 10;
		int booksOnShelves = (dadsTotalBooks / totalNumberOfShelves);
		
		System.out.println(booksOnShelves + " books per shelf");
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		
		int bakedCroissants = 17;
		int amountOfGuests = 7;
		
		System.out.println(bakedCroissants / amountOfGuests);
		
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */


	}

}
