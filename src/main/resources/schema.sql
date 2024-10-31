create table if not exists difficulty
(
    id         bigint primary key auto_increment,
    name       varchar(255) not null,
    created_at datetime     not null,
    created_by varchar(255) not null,
    updated_at datetime     default null,
    updated_by varchar(255) default null
);

alter table difficulty
    add constraint unique_difficulty_name
        unique (name);

create table if not exists category
(
    id         bigint primary key auto_increment,
    name       varchar(255) not null,
    created_at datetime     not null,
    created_by varchar(255) not null,
    updated_at datetime     default null,
    updated_by varchar(255) default null
);

alter table category
    add constraint unique_category_name
        unique (name);

create table if not exists hashtag
(
    id         bigint primary key auto_increment,
    name       varchar(255) not null,
    created_at datetime     not null,
    created_by varchar(255) not null,
    updated_at datetime     default null,
    updated_by varchar(255) default null
);

alter table hashtag
    add constraint unique_hashtag_name
        unique (name);

create table if not exists ingredient
(
    id         bigint primary key auto_increment,
    name       varchar(255) not null,
    created_at datetime     not null,
    created_by varchar(255) not null,
    updated_at datetime     default null,
    updated_by varchar(255) default null
);

alter table ingredient
    add constraint unique_ingredient_name
        unique (name);

create table if not exists recipe
(
    id               bigint primary key auto_increment,
    name             varchar(255)   not null,
    description      varchar(255)   not null,
    difficulty_id    bigint         not null,
    category_id      bigint         not null,
    servings         decimal(10, 2) not null,
    preparation_time time           not null,
    instructions     text           not null,
    created_at       datetime       not null,
    created_by       varchar(255)   not null,
    updated_at       datetime     default null,
    updated_by       varchar(255) default null
);

alter table recipe
    add constraint fk_recipe_difficulty
        foreign key (difficulty_id) references difficulty (id);

alter table recipe
    add constraint fk_recipe_category
        foreign key (category_id) references category (id);

create table if not exists recipe_hashtag
(
    recipe_id  bigint not null,
    hashtag_id bigint not null
);

alter table recipe_hashtag
    add constraint pk_recipe_hashtag
        primary key (recipe_id, hashtag_id);

alter table recipe_hashtag
    add constraint fk_recipe_hashtag_recipe
        foreign key (recipe_id) references recipe (id);

alter table recipe_hashtag
    add constraint fk_recipe_hashtag_hashtag
        foreign key (hashtag_id) references hashtag (id);

create table if not exists recipe_ingredient
(
    recipe_id     bigint         not null,
    ingredient_id bigint         not null,
    quantity      decimal(10, 2) not null
);

alter table recipe_ingredient
    add constraint pk_recipe_ingredient
        primary key (recipe_id, ingredient_id);

alter table recipe_ingredient
    add constraint fk_recipe_ingredient_recipe
        foreign key (recipe_id) references recipe (id);

alter table recipe_ingredient
    add constraint fk_recipe_ingredient_ingredient
        foreign key (ingredient_id) references ingredient (id);
