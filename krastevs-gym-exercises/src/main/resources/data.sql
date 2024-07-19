-- https://docs.spring.io/spring-boot/docs/current/reference/html/howto.html#howto.data-initialization.using-basic-sql-scripts





-- exercises
INSERT INTO exercises (name, instructions, equipment_type, category, gif_url,
                       muscles_worked_url, user_id)
VALUES ('Stability ball V-pass', 'Lie with your back flat on the floor with your legs extended straight on the floor, holding a stability ball overhead with both hands. Brace your core to minimize any arch in your lower back. This is your starting position.
Squeeze your abs to lift your arms and legs to place the ball between your calves, creating a “V” position.
Lower back down to the starting position, but this time with the ball between your legs.
Repeat the movement, passing the ball back and forth between your hands and legs.', 'BODYWEIGHT', 'ABS',
        'https://res.cloudinary.com/dgtuddxqf/image/upload/v1719701050/krastevs-gym/imgs/abs/gifs/stability-ball-v-pass_e9fle3.gif',
        'https://res.cloudinary.com/dgtuddxqf/image/upload/v1719702627/krastevs-gym/imgs/muscles/view_of_muscles_kfthdn.jpg', 1);

INSERT INTO exercises (name, instructions, equipment_type, category, gif_url,
                       muscles_worked_url, user_id)
VALUES ('One-arm dumbbell preacher curl', 'Sit on the preacher bench with a dumbbell in your hand.
Supinate your forearm (turn your palm upward), bend your elbow so that the dumbbell faces your shoulder, and rest your upper arm flat on the bench.
Inhale as you lower the dumbbell until your arm is almost fully extended.
Exhale as you curl the dumbbell to the starting position.
Repeat for the desired number of repetitions.
Repeat with your opposite arm.', 'DUMBBELLS', 'BICEPS',
        'https://res.cloudinary.com/dgtuddxqf/image/upload/v1719701055/krastevs-gym/imgs/biceps/gifs/one-arm-dumbbell-preacher-curl_qu78vm.gif',
        'https://res.cloudinary.com/dgtuddxqf/image/upload/v1719702627/krastevs-gym/imgs/muscles/view_of_muscles_kfthdn.jpg', 1);

INSERT INTO exercises (name, instructions, equipment_type, category, gif_url,
                       muscles_worked_url, user_id)
VALUES ('Reverse Grip Triceps Pushdown', 'Start by setting a bar attachment (straight or e-z) on a high pulley machine.
Facing the bar attachment, grab it with the palms facing up (supinated grip) at shoulder width. Lower the bar by using your lats until your arms are fully extended by your sides. Tip: Elbows should be in by your sides and your feet should be shoulder width apart from each other. This is the starting position.
Slowly elevate the bar attachment up as you inhale so it is aligned with your chest. Only the forearms should move and the elbows/upper arms should be stationary by your side at all times.
Then begin to lower the cable bar back down to the original staring position while exhaling and contracting the triceps hard.
Repeat for the recommended amount of repetitions.
Variation: This exercise can also be performed with a single handle using one arm at a time. This will allow you to better isolate the triceps. With this version you can self spot yourself by placing your hand over your forearm and applying some pressure to help you perform more reps than before.',
        'MACHINES', 'TRICEPS',
        'https://res.cloudinary.com/dgtuddxqf/image/upload/v1719701047/krastevs-gym/imgs/triceps/gifs/reverse-grip-triceps-pushdown_jyis9l.gif',
        'https://res.cloudinary.com/dgtuddxqf/image/upload/v1719702627/krastevs-gym/imgs/muscles/view_of_muscles_kfthdn.jpg', 1);

INSERT INTO exercises (name, instructions, equipment_type, category, gif_url,
                       muscles_worked_url, user_id)
VALUES ('Triceps dip', 'Mount the should-width dip bars and straighten your arms so that your legs are suspended off the ground.
Keeping your elbows tucked in and your body upright, slowly lower your body until your elbows form a 90-degree angle or you feel a slight stretch in your shoulders. Don’t forget to inhale.
Exhale as you push your body back up to the starting position.
Repeat for the recommended number of repetitions.', 'BODYWEIGHT', 'TRICEPS',
        'https://res.cloudinary.com/dgtuddxqf/image/upload/v1719701041/krastevs-gym/imgs/triceps/gifs/triceps-dip_set7r5.gif',
        'https://res.cloudinary.com/dgtuddxqf/image/upload/v1719702627/krastevs-gym/imgs/muscles/view_of_muscles_kfthdn.jpg', 1);

INSERT INTO exercises (name, instructions, equipment_type, category, gif_url,
                       muscles_worked_url, user_id)
VALUES ('Dumbbell one-arm reverse wrist curl', 'Holding a dumbbell in one hand, kneel by the side of a flat bench.
Turn your palm downward (pronate your wrist) and place your forearm flat on the bench, with your wrist and the dumbbell extending off the edge.
Exhale as you raise the dumbbell by extending your wrist.
Hold for a count of two.
Inhale as you slowly lower the dumbbell to the starting position by flexing your wrist.
Repeat for the prescribed number of repetitions.
Repeat the exercise with your opposite arm.', 'DUMBBELLS', 'FOREARMS',
        'https://res.cloudinary.com/dgtuddxqf/image/upload/v1719701059/krastevs-gym/imgs/forearms/gifs/dumbbell-one-arm-reverse-wrist-curl_t2tmqw.gif',
        'https://res.cloudinary.com/dgtuddxqf/image/upload/v1719702627/krastevs-gym/imgs/muscles/view_of_muscles_kfthdn.jpg', 1);



