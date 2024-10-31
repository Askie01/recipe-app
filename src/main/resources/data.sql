insert into difficulty(name, created_at, created_by)
values ('BEGINNER', now(), 'admin'),
       ('EASY', now(), 'admin'),
       ('MEDIUM', now(), 'admin'),
       ('HARD', now(), 'admin'),
       ('ASIAN', now(), 'admin');

insert into category(name, created_at, created_by)
values ('INDIAN', now(), 'admin'),
       ('ITALIAN', now(), 'admin'),
       ('CYPRUS', now(), 'admin'),
       ('EUROPEAN', now(), 'admin'),
       ('AMERICAN', now(), 'admin');

insert into hashtag(name, created_at, created_by)
values ('#New', now(), 'admin'),
       ('#Fresh', now(), 'admin'),
       ('#Healthy', now(), 'admin'),
       ('#Fast', now(), 'admin'),
       ('#5minutes', now(), 'admin');

insert into ingredient(name, created_at, created_by)
values ('sunflower oil', now(), 'admin'),
       ('onion', now(), 'admin'),
       ('garlic clove', now(), 'admin'),
       ('ginger', now(), 'admin'),
       ('chicken thigh', now(), 'admin'),
       ('spice pasta', now(), 'admin'),
       ('chopped tomatoes', now(), 'admin'),
       ('greek yogurt', now(), 'admin'),
       ('coriander', now(), 'admin'),
       ('ground almonds', now(), 'admin'),
       ('basmati rice', now(), 'admin'),

       ('red pepper', now(), 'admin'),
       ('aubergines', now(), 'admin'),
       ('olive oil', now(), 'admin'),
       ('lasagne sheets', now(), 'admin'),
       ('mozzarella', now(), 'admin'),
       ('chery tomato', now(), 'admin'),
       ('carrot', now(), 'admin'),
       ('tomato purée', now(), 'admin'),
       ('white wine', now(), 'admin'),
       ('basil', now(), 'admin'),
       ('butter', now(), 'admin'),
       ('plain flour', now(), 'admin'),
       ('milk', now(), 'admin'),

       ('halloumi cheese', now(), 'admin'),
       ('ground cumin', now(), 'admin'),
       ('turmeric', now(), 'admin'),
       ('double cream', now(), 'admin'),
       ('spinach', now(), 'admin'),
       ('sugar', now(), 'admin'),
       ('garam masala', now(), 'admin'),
       ('nigella seeds', now(), 'admin'),
       ('rice', now(), 'admin'),

       ('light muscovado sugar', now(), 'admin'),
       ('egg', now(), 'admin'),
       ('grated carrot', now(), 'admin'),
       ('raisins', now(), 'admin'),
       ('orange', now(), 'admin'),
       ('self-raising flour', now(), 'admin'),
       ('bicarbonate of soda', now(), 'admin'),
       ('ground cinnamon', now(), 'admin'),
       ('grated nutmeg', now(), 'admin'),
       ('icing sugar', now(), 'admin'),
       ('orange juice', now(), 'admin'),

       ('strong white flour', now(), 'admin'),
       ('salt', now(), 'admin'),
       ('fast-action yeasts', now(), 'admin'),
       ('water', now(), 'admin');

insert into recipe(name, description, difficulty_id, category_id,
                   servings, preparation_time, instructions,
                   created_at, created_by)
values ('Easy chicken curry',
        'This easy staple chicken curry is a fantastic recipe for family dinners.' ||
        'Its made with just a handful of ingredients and is enriched with creamy yogurt',
        2, 1, 4, '00:45:00',
        'STEP 1' ||
        'Heat the oil in a flameproof casserole dish or large frying pan over a medium heat.' ||
        'Add the onion and a generous pinch of salt and fry for 8-10 mins, or until the onion has turned golden brown and sticky.' ||
        'Add the garlic and ginger, cooking for a further minute.' ||
        'STEP 2' ||
        'Chop the chicken into chunky 3cm pieces, add to the pan and fry for 5 mins before stirring through the spice paste and tomatoes, along with 250ml water.' ||
        'Bring to the boil, lower to a simmer and cook on a gentle heat uncovered for 25-30 mins or until rich and slightly reduced.' ||
        'Stir though the yogurt, coriander and ground almonds, season and serve with warm naan or fluffy basmati rice.',
        now(), 'admin'),

       ('Vegetarian lasagne',
        'Make our easy vegetable lasagne using just a few ingredients.' ||
        'You can use ready-made tomato sauce and white sauce, or batch cook the sauces and freeze them',
        2, 2, 10, '1:10:00',
        'STEP 1' ||
        'To make the tomato sauce, heat the olive oil in a saucepan.' ||
        'Add the onions, garlic and carrot. Cook for 5-7 mins over a medium heat until softened.' ||
        'Turn up the heat a little and stir in the tomato purée.' ||
        'Cook for 1 min, pour in the white wine, then cook for 5 mins until this has reduced by two-thirds.' ||
        'Pour over the chopped tomatoes and add the basil leaves. Bring to the boil then simmer for 20 mins.' ||
        'Leave to cool then whizz in a food processor.' ||
        'Will keep, cooled, in the fridge for up to three days or frozen for three months.' ||
        'STEP 2' ||
        'To make the white sauce, melt the butter in a saucepan, stir in the plain flour, then cook for 2 mins.' ||
        'Slowly whisk in the milk, then bring to the boil, stirring.' ||
        'Turn down the heat, then cook until the sauce starts to thicken and coats the back of a wooden spoon.' ||
        'Will keep, cooled, in the fridge for up to three days or frozen for three months.' ||
        'STEP 3' ||
        'Heat the oven to 200C/180C fan/gas 6.' ||
        'Lightly oil two large baking trays and add the peppers and aubergines.' ||
        'Toss with the olive oil, season well, then roast for 25 mins until lightly browned.' ||
        'STEP 4' ||
        'Reduce the oven to 180C/160C fan/gas 4.' ||
        'Lightly oil a 30 x 20cm ovenproof dish.' ||
        'Arrange a layer of the vegetables on the bottom, then pour over a third of the tomato sauce.' ||
        'Top with a layer of lasagne sheets, then drizzle over a quarter of the white sauce.' ||
        'Repeat until you have three layers of pasta.' ||
        'STEP 5' ||
        'Spoon the remaining white sauce over the pasta, making sure the whole surface is covered, then scatter over the mozzarella and cherry tomatoes.' ||
        'Bake for 45 mins until bubbling and golden.',
        now(), 'admin'),

       ('Creamy halloumi & tomato curry',
        'Enjoy halloumi in this family-friendly curry - it has a wonderfule texture, similar to paneer.' ||
        'You may want to halve the amount of garam masala for young children.',
        2, 3, 3, '00:20:00',
        'STEP 1' ||
        'Cut the halloumi into bite-sized cubes and set them aside.' ||
        'Heat 1 tbsp of the oil in a large pan over a medium heat.' ||
        'Add the onion and cook for about 5 mins, or until it turns translucent.' ||
        'STEP 2' ||
        'Add the garlic and ginger to the pan. Cook for another 2 mins, stirring frequently, until they become fragrant.' ||
        'Stir in the cumin, coriander and turmeric, and cook for 2 mins more.' ||
        'Pour in the tomatoes and stir well.' ||
        'Simmer for 5-7 mins, or until the mixture thickens.' ||
        'STEP 3' ||
        'Reduce the heat and add the cream.' ||
        'Stir and simmer gently for 3-4 mins until thickened.' ||
        'STEP 4' ||
        'While the sauce is simmering, heat the remaining 1 tbsp oil in a separate pan over a medium-high heat.' ||
        'Fry the halloumi for 3-4 mins until golden brown on all sides.' ||
        'STEP 5' ||
        'Once the halloumi is browned, add it to the sauce along with the spinach, sugar and garam masala and stir to combine.' ||
        'Gently simmer for 5 mins until the spinach has wilted or defrosted.' ||
        'If the curry seems too thick, add a splash of water or more cream to loosen it.' ||
        'Scatter with nigella seeds and serve with rice, grains or naan.',
        now(), 'admin'),

       ('Carrot cake',
        'Delight friends with an afternoon tea that includes this easy carrot cake.' ||
        'You can bake the cake, freeze it and just drizzle over the icing on the day',
        2, 4, 15, '1:15:00',
        'STEP 1' ||
        'Heat the oven to 180C/160C fan/gas 4.' ||
        'Oil and line the base and sides of an 18cm square cake tin with baking parchment.' ||
        'STEP 2' ||
        'Tip the sugar, sunflower oil and eggs into a big mixing bowl.' ||
        'Lightly mix with a wooden spoon. Stir in the carrots, raisins and orange zest.' ||
        'STEP 3' ||
        'Sift the flour, bicarbonate of soda, cinnamon and nutmeg into the bowl.' ||
        'Mix everything together, the mixture will be soft and almost runny.' ||
        'STEP 4' ||
        'Pour the mixture into the prepared tin and bake for 40-45 mins or until it feels firm and springy when you press it in the centre.' ||
        'STEP 5' ||
        'Cool in the tin for 5 mins, then turn it out, peel off the paper and cool on a wire rack.' ||
        '(You can freeze the cake at this point if you want to serve it at a later date.)' ||
        'STEP 6' ||
        'Beat the icing sugar and orange juice in a small bowl until smooth – you want the icing about as runny as single cream.' ||
        'Put the cake on a serving plate and boldly drizzle the icing back and forth in diagonal lines over the top, letting it drip down the sides.',
        now(), 'admin'),

       ('Easy white bread',
        'A great recipe for an electric breadmaker - or do it the traditional way',
        2, 5, 1, '00:25:00',
        'STEP 1' ||
        'Mix 500g strong white flour, 2 tsp salt and a 7g sachet of fast-action yeast in a large bowl.' ||
        'STEP 2' ||
        'Make a well in the centre, then add 3 tbsp olive oil and 300ml water, and mix well.' ||
        'If the dough seems a little stiff, add another 1-2 tbsp water and mix well.' ||
        'STEP 3' ||
        'Tip onto a lightly floured work surface and knead for around 10 mins.' ||
        'STEP 4' ||
        'Once the dough is satin-smooth, place it in a lightly oiled bowl and cover with cling film.' ||
        'Leave to rise for 1 hour until doubled in size or place in the fridge overnight.' ||
        'STEP 5' ||
        'Line a baking tray with baking parchment.' ||
        'Knock back the dough (punch the air out and pull the dough in on itself) then gently mould the dough into a ball.' ||
        'STEP 6' ||
        'Place it on the baking parchment to prove for a further hour until doubled in size.' ||
        'STEP 7' ||
        'Heat oven to 220C/fan 200C/gas 7.' ||
        'STEP 8' ||
        'Dust the loaf with some extra flour and cut a cross about 6cm long into the top of the loaf with a sharp knife.' ||
        'STEP 9' ||
        'Bake for 25-30 mins until golden brown and the loaf sounds hollow when tapped underneath.' ||
        'Cool on a wire rack.',
        now(), 'admin');

insert into recipe_hashtag
values (1, 1),
       (1, 2),
       (1, 3),
       (1, 4),
       (2, 2),
       (2, 3),
       (3, 1),
       (3, 4),
       (4, 1),
       (4, 3),
       (5, 2),
       (5, 3);

insert into recipe_ingredient
values (1, 1, 10),
       (1, 2, 110),
       (1, 3, 10),
       (1, 4, 5),
       (1, 5, 780),
       (1, 6, 15),
       (1, 7, 400),
       (1, 8, 100),
       (1, 9, 15),
       (1, 10, 50),
       (1, 11, 150),

       (2, 12, 600),
       (2, 13, 450),
       (2, 14, 50),
       (2, 15, 300),
       (2, 16, 125),
       (2, 17, 100),
       (2, 2, 200),
       (2, 3, 10),
       (2, 18, 60),
       (2, 19, 30),
       (2, 20, 200),
       (2, 7, 1200),
       (2, 21, 100),
       (2, 22, 85),
       (2, 23, 85),
       (2, 24, 750),

       (3, 25, 225),
       (3, 1, 10),
       (3, 2, 150),
       (3, 3, 10),
       (3, 4, 45),
       (3, 26, 10),
       (3, 9, 10),
       (3, 27, 5),
       (3, 7, 400),
       (3, 28, 100),
       (3, 29, 80),
       (3, 30, 10),
       (3, 31, 5),
       (3, 32, 5),
       (3, 33, 150),

       (4, 34, 175),
       (4, 1, 175),
       (4, 35, 165),
       (4, 36, 140),
       (4, 37, 100),
       (4, 38, 160),
       (4, 39, 175),
       (4, 40, 5),
       (4, 41, 5),
       (4, 42, 2.5),
       (4, 43, 175),
       (4, 44, 7.5),

       (5, 45, 500),
       (5, 46, 10),
       (5, 47, 7),
       (5, 14, 45),
       (5, 48, 300);