1. Первое знакомство

а)MacBook-Pro-Mark:~ mraker$ id
uid=501(mraker) gid=20(staff) groups=20(staff),12(everyone),61(localaccounts),79(_appserverusr),80(admin),81(_appserveradm),98(_lpadmin),33(_appstore),100(_lpoperator),204(_developer),250(_analyticsusers),395(com.apple.access_ftp),398(com.apple.access_screensharing),399(com.apple.access_ssh),400(com.apple.access_remote_ae),701(com.apple.sharepoint.group.1)

b)MacBook-Pro-Mark:~ mraker$ date
четверг, 10 сентября 2020 г. 12:35:53 (MSK)

c)MacBook-Pro-Mark:~ mraker$ pwd
/Users/mraker

d_1)MacBook-Pro-Mark:~ mraker$ ls
Applications                        Movies
Applications (Parallels)                Music
Creative Cloud Files                    Parallels
Desktop                            Pictures
Documents                        Projects
Downloads                        Public
Google Диск                        PycharmProjects
IdeaProjects                        Yandex.Disk.localized
Library                            djslender.minecraft@gmail.com Creative Cloud Files
MEGA                            log
Mail.Ru                            zdadsda@gmail.com Creative Cloud Files

d_2)MacBook-Pro-Mark:~ mraker$ ls -l
total 0
drwx------@  6 mraker  staff   192  7 авг 01:37 Applications
drwx------@  4 mraker  staff   128 10 сен 09:40 Applications (Parallels)
drwxrwxr-x@  4 mraker  staff   128 29 июл 11:23 Creative Cloud Files
drwx------@  8 mraker  staff   256 28 авг 13:11 Desktop
drwx------@ 11 mraker  staff   352 10 сен 09:57 Documents
drwx------@ 20 mraker  staff   640 10 сен 12:29 Downloads
drwx------@  9 mraker  staff   288 30 авг 09:35 Google Диск
drwxr-xr-x   8 mraker  staff   256 10 сен 11:45 IdeaProjects
drwx------@ 96 mraker  staff  3072  9 сен 10:56 Library
drwxr-xr-x  11 mraker  staff   352 25 авг 13:51 MEGA
drwx------@  7 mraker  staff   224  7 авг 08:08 Mail.Ru
drwx------+ 11 mraker  staff   352  7 авг 01:35 Movies
drwx------+  9 mraker  staff   288  7 авг 01:35 Music
drwxr-xr-x   3 mraker  staff    96  7 авг 01:28 Parallels
drwx------+ 18 mraker  staff   576 28 авг 12:54 Pictures
drwxr-xr-x   3 mraker  staff    96  9 сен 11:59 Projects
drwxr-xr-x+  4 mraker  staff   128 23 июн  2019 Public
drwxr-xr-x   3 mraker  staff    96  6 сен 13:00 PycharmProjects
drwxr-xr-x@ 16 mraker  staff   512 28 авг 13:11 Yandex.Disk.localized
drwxrwxr-x   2 mraker  staff    64 24 ноя  2019 djslender.minecraft@gmail.com Creative Cloud Files
drwxr-xr-x   3 mraker  staff    96  7 авг 01:38 log
drwxrwxr-x   2 mraker  staff    64 29 июл 11:23 zdadsda@gmail.com Creative Cloud Files

d_3)MacBook-Pro-Mark:~ mraker$ ls -a
.                            .subversion
..                            .templateengine
.CFUserTextEncoding                    .viminfo
.DS_Store                        .yandex
.IdentityService                    Applications
.ServiceHub                        Applications (Parallels)
.Trash                            Creative Cloud Files
.android                        Desktop
.atom                            Documents
.bash_history                        Downloads
.bash_imb                        Google Диск
.bash_profile                        IdeaProjects
.bash_sessions                        Library
.config                            MEGA
.cups                            Mail.Ru
.dotnet                            Movies
.git                            Music
.gitconfig                        Parallels
.lesshst                        Pictures
.lldb                            Projects
.local                            Public
.mono                            PycharmProjects
.mplayer                        Yandex.Disk.localized
.mysql_history                        djslender.minecraft@gmail.com Creative Cloud Files
.npm                            log
.nuget                            zdadsda@gmail.com Creative Cloud Files
.oracle_jre_usage


2. Файловая система

a) MacBook-Pro-Mark:~ mraker$ ls -l /dev
total 0
crw-------  1 root    wheel           19,   1 30 авг 09:34 afsc_type5
crw-------  1 root    wheel           10,   0 30 авг 09:34 auditpipe
crw-r--r--  1 root    wheel            9,   2 30 авг 09:34 auditsessions
crw-------  1 root    wheel           22,   0 30 авг 09:34 autofs
crw-------  1 root    wheel           34,   0 30 авг 09:34 autofs_control
crw-rw-rw-  1 root    wheel           33, 137 30 авг 09:34 autofs_homedirmounter
crw-rw-rw-  1 root    wheel           32, 137 30 авг 09:34 autofs_notrigger
crw-rw-rw-  1 root    wheel           31, 0x00000351 30 авг 09:34 autofs_nowait
crw-------  1 root    wheel           23,   0 30 авг 09:34 bpf0
crw-------  1 root    wheel           23,   1 30 авг 09:34 bpf1
crw-------  1 root    wheel           23,   2 16 сен 19:05 bpf2
crw-------  1 root    wheel           23,   3 16 сен 19:05 bpf3
crw-------  1 root    wheel           23,   4 31 авг 04:15 bpf4
crw-------  1 mraker  staff            0,   0  6 сен 17:00 console
crw-rw-rw-  1 root    wheel           18,   3 30 авг 09:34 cu.AirPods-WirelessiAP
crw-rw-rw-  1 root    wheel           18,   5 30 авг 09:34 cu.AirPodsMasha-WirelessiAP
crw-rw-rw-  1 root    wheel           18,   1 30 авг 09:34 cu.Bluetooth-Incoming-Port
brw-r-----  1 root    operator         1,   0 30 авг 09:34 disk0
brw-r-----  1 root    operator         1,   1 30 авг 09:34 disk0s1
brw-r-----  1 root    operator         1,   2 30 авг 09:34 disk0s2
brw-r-----  1 root    operator         1,   3 30 авг 09:34 disk1
brw-r-----  1 root    operator         1,   4 30 авг 09:34 disk1s1
brw-r-----  1 root    operator         1,   5 30 авг 09:34 disk1s2
brw-r-----  1 root    operator         1,   7 30 авг 09:34 disk1s3
brw-r-----  1 root    operator         1,   6 30 авг 09:34 disk1s4
brw-r-----  1 root    operator         1,   8 30 авг 09:34 disk1s5
crw-rw-rw-  1 root    wheel           24,  31 30 авг 09:34 dtrace
crw-rw-rw-  1 root    wheel           25,   0 30 авг 09:34 dtracehelper
crw-rw-rw-  1 root    wheel            0,   0 30 авг 09:34 fbt
dr-xr-xr-x  1 root    wheel                 0 30 авг 09:34 fd
crw-r--r--  1 root    wheel           13,   0 30 авг 09:34 fsevents
crw-rw-rw-  1 root    wheel           20,   9 16 сен 19:05 io8log
cr--r--r--  1 root    wheel           20,  13 30 авг 09:34 io8logmt
crw-rw-rw-  1 root    wheel           20,  14 16 сен 19:45 io8logtemp
crw-------  1 root    wheel            6,   0 30 авг 09:34 klog
crw-rw-rw-  1 root    wheel            0,   0 30 авг 09:34 lockstat
crw-rw-rw-  1 root    wheel            0,   0 30 авг 09:34 machtrace
crw-rw-rw-  1 root    wheel            3,   2 16 сен 19:45 null
crw-------  1 root    wheel            7,   0 30 авг 09:34 oslog
crw-------  1 root    wheel            8,   0 30 авг 09:34 oslog_stream
crw-------  1 root    wheel           11,   0 30 авг 09:34 pf
crw-------  1 root    wheel           11,   1 30 авг 09:34 pfm
crw-rw-rw-  1 root    wheel            0,   0 30 авг 09:34 profile
crw-rw-rw-  1 root    tty             15,   1 16 сен 19:45 ptmx
crw-rw-rw-  1 root    wheel            5,   0 30 авг 09:34 ptyp0
crw-rw-rw-  1 root    wheel            5,   1 30 авг 09:34 ptyp1
crw-rw-rw-  1 root    wheel            5,   2 30 авг 09:34 ptyp2
crw-rw-rw-  1 root    wheel            5,   3 30 авг 09:34 ptyp3
crw-rw-rw-  1 root    wheel            5,   4 30 авг 09:34 ptyp4
crw-rw-rw-  1 root    wheel            5,   5 30 авг 09:34 ptyp5
crw-rw-rw-  1 root    wheel            5,   6 30 авг 09:34 ptyp6
crw-rw-rw-  1 root    wheel            5,   7 30 авг 09:34 ptyp7
crw-rw-rw-  1 root    wheel            5,   8 30 авг 09:34 ptyp8
crw-rw-rw-  1 root    wheel            5,   9 30 авг 09:34 ptyp9
crw-rw-rw-  1 root    wheel            5,  10 30 авг 09:34 ptypa
crw-rw-rw-  1 root    wheel            5,  11 30 авг 09:34 ptypb
crw-rw-rw-  1 root    wheel            5,  12 30 авг 09:34 ptypc
crw-rw-rw-  1 root    wheel            5,  13 30 авг 09:34 ptypd
crw-rw-rw-  1 root    wheel            5,  14 30 авг 09:34 ptype
crw-rw-rw-  1 root    wheel            5,  15 30 авг 09:34 ptypf
crw-rw-rw-  1 root    wheel            5,  16 30 авг 09:34 ptyq0
crw-rw-rw-  1 root    wheel            5,  17 30 авг 09:34 ptyq1
crw-rw-rw-  1 root    wheel            5,  18 30 авг 09:34 ptyq2
crw-rw-rw-  1 root    wheel            5,  19 30 авг 09:34 ptyq3
crw-rw-rw-  1 root    wheel            5,  20 30 авг 09:34 ptyq4
crw-rw-rw-  1 root    wheel            5,  21 30 авг 09:34 ptyq5
crw-rw-rw-  1 root    wheel            5,  22 30 авг 09:34 ptyq6
crw-rw-rw-  1 root    wheel            5,  23 30 авг 09:34 ptyq7
crw-rw-rw-  1 root    wheel            5,  24 30 авг 09:34 ptyq8
crw-rw-rw-  1 root    wheel            5,  25 30 авг 09:34 ptyq9
crw-rw-rw-  1 root    wheel            5,  26 30 авг 09:34 ptyqa
crw-rw-rw-  1 root    wheel            5,  27 30 авг 09:34 ptyqb
crw-rw-rw-  1 root    wheel            5,  28 30 авг 09:34 ptyqc
crw-rw-rw-  1 root    wheel            5,  29 30 авг 09:34 ptyqd
crw-rw-rw-  1 root    wheel            5,  30 30 авг 09:34 ptyqe
crw-rw-rw-  1 root    wheel            5,  31 30 авг 09:34 ptyqf
crw-rw-rw-  1 root    wheel            5,  32 30 авг 09:34 ptyr0
crw-rw-rw-  1 root    wheel            5,  33 30 авг 09:34 ptyr1
crw-rw-rw-  1 root    wheel            5,  34 30 авг 09:34 ptyr2
crw-rw-rw-  1 root    wheel            5,  35 30 авг 09:34 ptyr3
crw-rw-rw-  1 root    wheel            5,  36 30 авг 09:34 ptyr4
crw-rw-rw-  1 root    wheel            5,  37 30 авг 09:34 ptyr5
crw-rw-rw-  1 root    wheel            5,  38 30 авг 09:34 ptyr6
crw-rw-rw-  1 root    wheel            5,  39 30 авг 09:34 ptyr7
crw-rw-rw-  1 root    wheel            5,  40 30 авг 09:34 ptyr8
crw-rw-rw-  1 root    wheel            5,  41 30 авг 09:34 ptyr9
crw-rw-rw-  1 root    wheel            5,  42 30 авг 09:34 ptyra
crw-rw-rw-  1 root    wheel            5,  43 30 авг 09:34 ptyrb
crw-rw-rw-  1 root    wheel            5,  44 30 авг 09:34 ptyrc
crw-rw-rw-  1 root    wheel            5,  45 30 авг 09:34 ptyrd
crw-rw-rw-  1 root    wheel            5,  46 30 авг 09:34 ptyre
crw-rw-rw-  1 root    wheel            5,  47 30 авг 09:34 ptyrf
crw-rw-rw-  1 root    wheel            5,  48 30 авг 09:34 ptys0
crw-rw-rw-  1 root    wheel            5,  49 30 авг 09:34 ptys1
crw-rw-rw-  1 root    wheel            5,  50 30 авг 09:34 ptys2
crw-rw-rw-  1 root    wheel            5,  51 30 авг 09:34 ptys3
crw-rw-rw-  1 root    wheel            5,  52 30 авг 09:34 ptys4
crw-rw-rw-  1 root    wheel            5,  53 30 авг 09:34 ptys5
crw-rw-rw-  1 root    wheel            5,  54 30 авг 09:34 ptys6
crw-rw-rw-  1 root    wheel            5,  55 30 авг 09:34 ptys7
crw-rw-rw-  1 root    wheel            5,  56 30 авг 09:34 ptys8
crw-rw-rw-  1 root    wheel            5,  57 30 авг 09:34 ptys9
crw-rw-rw-  1 root    wheel            5,  58 30 авг 09:34 ptysa
crw-rw-rw-  1 root    wheel            5,  59 30 авг 09:34 ptysb
crw-rw-rw-  1 root    wheel            5,  60 30 авг 09:34 ptysc
crw-rw-rw-  1 root    wheel            5,  61 30 авг 09:34 ptysd
crw-rw-rw-  1 root    wheel            5,  62 30 авг 09:34 ptyse
crw-rw-rw-  1 root    wheel            5,  63 30 авг 09:34 ptysf
crw-rw-rw-  1 root    wheel            5,  64 30 авг 09:34 ptyt0
crw-rw-rw-  1 root    wheel            5,  65 30 авг 09:34 ptyt1
crw-rw-rw-  1 root    wheel            5,  66 30 авг 09:34 ptyt2
crw-rw-rw-  1 root    wheel            5,  67 30 авг 09:34 ptyt3
crw-rw-rw-  1 root    wheel            5,  68 30 авг 09:34 ptyt4
crw-rw-rw-  1 root    wheel            5,  69 30 авг 09:34 ptyt5
crw-rw-rw-  1 root    wheel            5,  70 30 авг 09:34 ptyt6
crw-rw-rw-  1 root    wheel            5,  71 30 авг 09:34 ptyt7
crw-rw-rw-  1 root    wheel            5,  72 30 авг 09:34 ptyt8
crw-rw-rw-  1 root    wheel            5,  73 30 авг 09:34 ptyt9
crw-rw-rw-  1 root    wheel            5,  74 30 авг 09:34 ptyta
crw-rw-rw-  1 root    wheel            5,  75 30 авг 09:34 ptytb
crw-rw-rw-  1 root    wheel            5,  76 30 авг 09:34 ptytc
crw-rw-rw-  1 root    wheel            5,  77 30 авг 09:34 ptytd
crw-rw-rw-  1 root    wheel            5,  78 30 авг 09:34 ptyte
crw-rw-rw-  1 root    wheel            5,  79 30 авг 09:34 ptytf
crw-rw-rw-  1 root    wheel            5,  80 30 авг 09:34 ptyu0
crw-rw-rw-  1 root    wheel            5,  81 30 авг 09:34 ptyu1
crw-rw-rw-  1 root    wheel            5,  82 30 авг 09:34 ptyu2
crw-rw-rw-  1 root    wheel            5,  83 30 авг 09:34 ptyu3
crw-rw-rw-  1 root    wheel            5,  84 30 авг 09:34 ptyu4
crw-rw-rw-  1 root    wheel            5,  85 30 авг 09:34 ptyu5
crw-rw-rw-  1 root    wheel            5,  86 30 авг 09:34 ptyu6
crw-rw-rw-  1 root    wheel            5,  87 30 авг 09:34 ptyu7
crw-rw-rw-  1 root    wheel            5,  88 30 авг 09:34 ptyu8
crw-rw-rw-  1 root    wheel            5,  89 30 авг 09:34 ptyu9
crw-rw-rw-  1 root    wheel            5,  90 30 авг 09:34 ptyua
crw-rw-rw-  1 root    wheel            5,  91 30 авг 09:34 ptyub
crw-rw-rw-  1 root    wheel            5,  92 30 авг 09:34 ptyuc
crw-rw-rw-  1 root    wheel            5,  93 30 авг 09:34 ptyud
crw-rw-rw-  1 root    wheel            5,  94 30 авг 09:34 ptyue
crw-rw-rw-  1 root    wheel            5,  95 30 авг 09:34 ptyuf
crw-rw-rw-  1 root    wheel            5,  96 30 авг 09:34 ptyv0
crw-rw-rw-  1 root    wheel            5,  97 30 авг 09:34 ptyv1
crw-rw-rw-  1 root    wheel            5,  98 30 авг 09:34 ptyv2
crw-rw-rw-  1 root    wheel            5,  99 30 авг 09:34 ptyv3
crw-rw-rw-  1 root    wheel            5, 100 30 авг 09:34 ptyv4
crw-rw-rw-  1 root    wheel            5, 101 30 авг 09:34 ptyv5
crw-rw-rw-  1 root    wheel            5, 102 30 авг 09:34 ptyv6
crw-rw-rw-  1 root    wheel            5, 103 30 авг 09:34 ptyv7
crw-rw-rw-  1 root    wheel            5, 104 30 авг 09:34 ptyv8
crw-rw-rw-  1 root    wheel            5, 105 30 авг 09:34 ptyv9
crw-rw-rw-  1 root    wheel            5, 106 30 авг 09:34 ptyva
crw-rw-rw-  1 root    wheel            5, 107 30 авг 09:34 ptyvb
crw-rw-rw-  1 root    wheel            5, 108 30 авг 09:34 ptyvc
crw-rw-rw-  1 root    wheel            5, 109 30 авг 09:34 ptyvd
crw-rw-rw-  1 root    wheel            5, 110 30 авг 09:34 ptyve
crw-rw-rw-  1 root    wheel            5, 111 30 авг 09:34 ptyvf
crw-rw-rw-  1 root    wheel            5, 112 30 авг 09:34 ptyw0
crw-rw-rw-  1 root    wheel            5, 113 30 авг 09:34 ptyw1
crw-rw-rw-  1 root    wheel            5, 114 30 авг 09:34 ptyw2
crw-rw-rw-  1 root    wheel            5, 115 30 авг 09:34 ptyw3
crw-rw-rw-  1 root    wheel            5, 116 30 авг 09:34 ptyw4
crw-rw-rw-  1 root    wheel            5, 117 30 авг 09:34 ptyw5
crw-rw-rw-  1 root    wheel            5, 118 30 авг 09:34 ptyw6
crw-rw-rw-  1 root    wheel            5, 119 30 авг 09:34 ptyw7
crw-rw-rw-  1 root    wheel            5, 120 30 авг 09:34 ptyw8
crw-rw-rw-  1 root    wheel            5, 121 30 авг 09:34 ptyw9
crw-rw-rw-  1 root    wheel            5, 122 30 авг 09:34 ptywa
crw-rw-rw-  1 root    wheel            5, 123 30 авг 09:34 ptywb
crw-rw-rw-  1 root    wheel            5, 124 30 авг 09:34 ptywc
crw-rw-rw-  1 root    wheel            5, 125 30 авг 09:34 ptywd
crw-rw-rw-  1 root    wheel            5, 126 30 авг 09:34 ptywe
crw-rw-rw-  1 root    wheel            5, 127 30 авг 09:34 ptywf
crw-rw-rw-  1 root    wheel           14,   0 30 авг 09:34 random
crw-r-----  1 root    operator         1,   0 30 авг 09:34 rdisk0
crw-r-----  1 root    operator         1,   1 30 авг 09:34 rdisk0s1
crw-r-----  1 root    operator         1,   2 30 авг 09:34 rdisk0s2
crw-r-----  1 root    operator         1,   3 30 авг 09:34 rdisk1
crw-r-----  1 root    operator         1,   4 30 авг 09:34 rdisk1s1
crw-r-----  1 root    operator         1,   5 30 авг 09:34 rdisk1s2
crw-r-----  1 root    operator         1,   7 30 авг 09:34 rdisk1s3
crw-r-----  1 root    operator         1,   6 30 авг 09:34 rdisk1s4
crw-r-----  1 root    operator         1,   8 30 авг 09:34 rdisk1s5
crw-rw-rw-  1 root    wheel            0,   0 30 авг 09:34 sdt
lr-xr-xr-x  1 root    wheel                 0 30 авг 09:34 stderr -> fd/2
lr-xr-xr-x  1 root    wheel                 0 30 авг 09:34 stdin -> fd/0
lr-xr-xr-x  1 root    wheel                 0 30 авг 09:34 stdout -> fd/1
crw-rw-rw-  1 root    wheel            0,   0 30 авг 09:34 systrace
crw-rw-rw-  1 root    wheel            2,   0 10 сен 14:52 tty
crw-rw-rw-  1 root    wheel           18,   2 30 авг 09:34 tty.AirPods-WirelessiAP
crw-rw-rw-  1 root    wheel           18,   4 30 авг 09:34 tty.AirPodsMasha-WirelessiAP
crw-rw-rw-  1 root    wheel           18,   0 30 авг 09:34 tty.Bluetooth-Incoming-Port
crw-rw-rw-  1 root    wheel            4,   0 30 авг 09:34 ttyp0
crw-rw-rw-  1 root    wheel            4,   1 30 авг 09:34 ttyp1
crw-rw-rw-  1 root    wheel            4,   2 30 авг 09:34 ttyp2
crw-rw-rw-  1 root    wheel            4,   3 30 авг 09:34 ttyp3
crw-rw-rw-  1 root    wheel            4,   4 30 авг 09:34 ttyp4
crw-rw-rw-  1 root    wheel            4,   5 30 авг 09:34 ttyp5
crw-rw-rw-  1 root    wheel            4,   6 30 авг 09:34 ttyp6
crw-rw-rw-  1 root    wheel            4,   7 30 авг 09:34 ttyp7
crw-rw-rw-  1 root    wheel            4,   8 30 авг 09:34 ttyp8
crw-rw-rw-  1 root    wheel            4,   9 30 авг 09:34 ttyp9
crw-rw-rw-  1 root    wheel            4,  10 30 авг 09:34 ttypa
crw-rw-rw-  1 root    wheel            4,  11 30 авг 09:34 ttypb
crw-rw-rw-  1 root    wheel            4,  12 30 авг 09:34 ttypc
crw-rw-rw-  1 root    wheel            4,  13 30 авг 09:34 ttypd
crw-rw-rw-  1 root    wheel            4,  14 30 авг 09:34 ttype
crw-rw-rw-  1 root    wheel            4,  15 30 авг 09:34 ttypf
crw-rw-rw-  1 root    wheel            4,  16 30 авг 09:34 ttyq0
crw-rw-rw-  1 root    wheel            4,  17 30 авг 09:34 ttyq1
crw-rw-rw-  1 root    wheel            4,  18 30 авг 09:34 ttyq2
crw-rw-rw-  1 root    wheel            4,  19 30 авг 09:34 ttyq3
crw-rw-rw-  1 root    wheel            4,  20 30 авг 09:34 ttyq4
crw-rw-rw-  1 root    wheel            4,  21 30 авг 09:34 ttyq5
crw-rw-rw-  1 root    wheel            4,  22 30 авг 09:34 ttyq6
crw-rw-rw-  1 root    wheel            4,  23 30 авг 09:34 ttyq7
crw-rw-rw-  1 root    wheel            4,  24 30 авг 09:34 ttyq8
crw-rw-rw-  1 root    wheel            4,  25 30 авг 09:34 ttyq9
crw-rw-rw-  1 root    wheel            4,  26 30 авг 09:34 ttyqa
crw-rw-rw-  1 root    wheel            4,  27 30 авг 09:34 ttyqb
crw-rw-rw-  1 root    wheel            4,  28 30 авг 09:34 ttyqc
crw-rw-rw-  1 root    wheel            4,  29 30 авг 09:34 ttyqd
crw-rw-rw-  1 root    wheel            4,  30 30 авг 09:34 ttyqe
crw-rw-rw-  1 root    wheel            4,  31 30 авг 09:34 ttyqf
crw-rw-rw-  1 root    wheel            4,  32 30 авг 09:34 ttyr0
crw-rw-rw-  1 root    wheel            4,  33 30 авг 09:34 ttyr1
crw-rw-rw-  1 root    wheel            4,  34 30 авг 09:34 ttyr2
crw-rw-rw-  1 root    wheel            4,  35 30 авг 09:34 ttyr3
crw-rw-rw-  1 root    wheel            4,  36 30 авг 09:34 ttyr4
crw-rw-rw-  1 root    wheel            4,  37 30 авг 09:34 ttyr5
crw-rw-rw-  1 root    wheel            4,  38 30 авг 09:34 ttyr6
crw-rw-rw-  1 root    wheel            4,  39 30 авг 09:34 ttyr7
crw-rw-rw-  1 root    wheel            4,  40 30 авг 09:34 ttyr8
crw-rw-rw-  1 root    wheel            4,  41 30 авг 09:34 ttyr9
crw-rw-rw-  1 root    wheel            4,  42 30 авг 09:34 ttyra
crw-rw-rw-  1 root    wheel            4,  43 30 авг 09:34 ttyrb
crw-rw-rw-  1 root    wheel            4,  44 30 авг 09:34 ttyrc
crw-rw-rw-  1 root    wheel            4,  45 30 авг 09:34 ttyrd
crw-rw-rw-  1 root    wheel            4,  46 30 авг 09:34 ttyre
crw-rw-rw-  1 root    wheel            4,  47 30 авг 09:34 ttyrf
crw-rw-rw-  1 root    wheel            4,  48 30 авг 09:34 ttys0
crw--w----  1 mraker  tty             16,   0 16 сен 19:45 ttys000
crw-rw-rw-  1 root    wheel            4,  49 30 авг 09:34 ttys1
crw-rw-rw-  1 root    wheel            4,  50 30 авг 09:34 ttys2
crw-rw-rw-  1 root    wheel            4,  51 30 авг 09:34 ttys3
crw-rw-rw-  1 root    wheel            4,  52 30 авг 09:34 ttys4
crw-rw-rw-  1 root    wheel            4,  53 30 авг 09:34 ttys5
crw-rw-rw-  1 root    wheel            4,  54 30 авг 09:34 ttys6
crw-rw-rw-  1 root    wheel            4,  55 30 авг 09:34 ttys7
crw-rw-rw-  1 root    wheel            4,  56 30 авг 09:34 ttys8
crw-rw-rw-  1 root    wheel            4,  57 30 авг 09:34 ttys9
crw-rw-rw-  1 root    wheel            4,  58 30 авг 09:34 ttysa
crw-rw-rw-  1 root    wheel            4,  59 30 авг 09:34 ttysb
crw-rw-rw-  1 root    wheel            4,  60 30 авг 09:34 ttysc
crw-rw-rw-  1 root    wheel            4,  61 30 авг 09:34 ttysd
crw-rw-rw-  1 root    wheel            4,  62 30 авг 09:34 ttyse
crw-rw-rw-  1 root    wheel            4,  63 30 авг 09:34 ttysf
crw-rw-rw-  1 root    wheel            4,  64 30 авг 09:34 ttyt0
crw-rw-rw-  1 root    wheel            4,  65 30 авг 09:34 ttyt1
crw-rw-rw-  1 root    wheel            4,  66 30 авг 09:34 ttyt2
crw-rw-rw-  1 root    wheel            4,  67 30 авг 09:34 ttyt3
crw-rw-rw-  1 root    wheel            4,  68 30 авг 09:34 ttyt4
crw-rw-rw-  1 root    wheel            4,  69 30 авг 09:34 ttyt5
crw-rw-rw-  1 root    wheel            4,  70 30 авг 09:34 ttyt6
crw-rw-rw-  1 root    wheel            4,  71 30 авг 09:34 ttyt7
crw-rw-rw-  1 root    wheel            4,  72 30 авг 09:34 ttyt8
crw-rw-rw-  1 root    wheel            4,  73 30 авг 09:34 ttyt9
crw-rw-rw-  1 root    wheel            4,  74 30 авг 09:34 ttyta
crw-rw-rw-  1 root    wheel            4,  75 30 авг 09:34 ttytb
crw-rw-rw-  1 root    wheel            4,  76 30 авг 09:34 ttytc
crw-rw-rw-  1 root    wheel            4,  77 30 авг 09:34 ttytd
crw-rw-rw-  1 root    wheel            4,  78 30 авг 09:34 ttyte
crw-rw-rw-  1 root    wheel            4,  79 30 авг 09:34 ttytf
crw-rw-rw-  1 root    wheel            4,  80 30 авг 09:34 ttyu0
crw-rw-rw-  1 root    wheel            4,  81 30 авг 09:34 ttyu1
crw-rw-rw-  1 root    wheel            4,  82 30 авг 09:34 ttyu2
crw-rw-rw-  1 root    wheel            4,  83 30 авг 09:34 ttyu3
crw-rw-rw-  1 root    wheel            4,  84 30 авг 09:34 ttyu4
crw-rw-rw-  1 root    wheel            4,  85 30 авг 09:34 ttyu5
crw-rw-rw-  1 root    wheel            4,  86 30 авг 09:34 ttyu6
crw-rw-rw-  1 root    wheel            4,  87 30 авг 09:34 ttyu7
crw-rw-rw-  1 root    wheel            4,  88 30 авг 09:34 ttyu8
crw-rw-rw-  1 root    wheel            4,  89 30 авг 09:34 ttyu9
crw-rw-rw-  1 root    wheel            4,  90 30 авг 09:34 ttyua
crw-rw-rw-  1 root    wheel            4,  91 30 авг 09:34 ttyub
crw-rw-rw-  1 root    wheel            4,  92 30 авг 09:34 ttyuc
crw-rw-rw-  1 root    wheel            4,  93 30 авг 09:34 ttyud
crw-rw-rw-  1 root    wheel            4,  94 30 авг 09:34 ttyue
crw-rw-rw-  1 root    wheel            4,  95 30 авг 09:34 ttyuf
crw-rw-rw-  1 root    wheel            4,  96 30 авг 09:34 ttyv0
crw-rw-rw-  1 root    wheel            4,  97 30 авг 09:34 ttyv1
crw-rw-rw-  1 root    wheel            4,  98 30 авг 09:34 ttyv2
crw-rw-rw-  1 root    wheel            4,  99 30 авг 09:34 ttyv3
crw-rw-rw-  1 root    wheel            4, 100 30 авг 09:34 ttyv4
crw-rw-rw-  1 root    wheel            4, 101 30 авг 09:34 ttyv5
crw-rw-rw-  1 root    wheel            4, 102 30 авг 09:34 ttyv6
crw-rw-rw-  1 root    wheel            4, 103 30 авг 09:34 ttyv7
crw-rw-rw-  1 root    wheel            4, 104 30 авг 09:34 ttyv8
crw-rw-rw-  1 root    wheel            4, 105 30 авг 09:34 ttyv9
crw-rw-rw-  1 root    wheel            4, 106 30 авг 09:34 ttyva
crw-rw-rw-  1 root    wheel            4, 107 30 авг 09:34 ttyvb
crw-rw-rw-  1 root    wheel            4, 108 30 авг 09:34 ttyvc
crw-rw-rw-  1 root    wheel            4, 109 30 авг 09:34 ttyvd
crw-rw-rw-  1 root    wheel            4, 110 30 авг 09:34 ttyve
crw-rw-rw-  1 root    wheel            4, 111 30 авг 09:34 ttyvf
crw-rw-rw-  1 root    wheel            4, 112 30 авг 09:34 ttyw0
crw-rw-rw-  1 root    wheel            4, 113 30 авг 09:34 ttyw1
crw-rw-rw-  1 root    wheel            4, 114 30 авг 09:34 ttyw2
crw-rw-rw-  1 root    wheel            4, 115 30 авг 09:34 ttyw3
crw-rw-rw-  1 root    wheel            4, 116 30 авг 09:34 ttyw4
crw-rw-rw-  1 root    wheel            4, 117 30 авг 09:34 ttyw5
crw-rw-rw-  1 root    wheel            4, 118 30 авг 09:34 ttyw6
crw-rw-rw-  1 root    wheel            4, 119 30 авг 09:34 ttyw7
crw-rw-rw-  1 root    wheel            4, 120 30 авг 09:34 ttyw8
crw-rw-rw-  1 root    wheel            4, 121 30 авг 09:34 ttyw9
crw-rw-rw-  1 root    wheel            4, 122 30 авг 09:34 ttywa
crw-rw-rw-  1 root    wheel            4, 123 30 авг 09:34 ttywb
crw-rw-rw-  1 root    wheel            4, 124 30 авг 09:34 ttywc
crw-rw-rw-  1 root    wheel            4, 125 30 авг 09:34 ttywd
crw-rw-rw-  1 root    wheel            4, 126 30 авг 09:34 ttywe
crw-rw-rw-  1 root    wheel            4, 127 30 авг 09:34 ttywf
crw-rw-rw-  1 root    wheel           14,   1 30 авг 09:34 urandom
crw-rw----  1 root    _windowserver   21,   0 30 авг 09:34 xcpm
crw-rw-rw-  1 root    wheel            3,   3 30 авг 09:34 zero

b) MacBook-Pro-Mark:~ mraker$ cd /dev
MacBook-Pro-Mark:dev mraker$ file *
afsc_type5:                   character special (19/1)
auditpipe:                    character special (10/0)
auditsessions:                character special (9/2)
autofs:                       character special (22/0)
autofs_control:               character special (34/0)
autofs_homedirmounter:        character special (33/140)
autofs_notrigger:             character special (32/140)
autofs_nowait:                character special (31/876)
bpf0:                         character special (23/0)
bpf1:                         character special (23/1)
bpf2:                         character special (23/2)
bpf3:                         character special (23/3)
bpf4:                         character special (23/4)
console:                      character special (0/0)
cu.AirPods-WirelessiAP:       character special (18/3)
cu.AirPodsMasha-WirelessiAP:  character special (18/5)
cu.Bluetooth-Incoming-Port:   character special (18/1)
disk0:                        block special (1/0)
disk0s1:                      block special (1/1)
disk0s2:                      block special (1/2)
disk1:                        block special (1/3)
disk1s1:                      block special (1/4)
disk1s2:                      block special (1/5)
disk1s3:                      block special (1/7)
disk1s4:                      block special (1/6)
disk1s5:                      block special (1/8)
dtrace:                       character special (24/2)
dtracehelper:                 character special (25/0)
fbt:                          character special (0/0)
fd:                           directory
fsevents:                     character special (13/0)
io8log:                       character special (20/15)
io8logmt:                     character special (20/9)
io8logtemp:                   character special (20/13)
klog:                         character special (6/0)
lockstat:                     character special (0/0)
machtrace:                    character special (0/0)
null:                         character special (3/2)
oslog:                        character special (7/0)
oslog_stream:                 character special (8/0)
pf:                           character special (11/0)
pfm:                          character special (11/1)
profile:                      character special (0/0)
ptmx:                         character special (15/1)
ptyp0:                        character special (5/0)
ptyp1:                        character special (5/1)
ptyp2:                        character special (5/2)
ptyp3:                        character special (5/3)
ptyp4:                        character special (5/4)
ptyp5:                        character special (5/5)
ptyp6:                        character special (5/6)
ptyp7:                        character special (5/7)
ptyp8:                        character special (5/8)
ptyp9:                        character special (5/9)
ptypa:                        character special (5/10)
ptypb:                        character special (5/11)
ptypc:                        character special (5/12)
ptypd:                        character special (5/13)
ptype:                        character special (5/14)
ptypf:                        character special (5/15)
ptyq0:                        character special (5/16)
ptyq1:                        character special (5/17)
ptyq2:                        character special (5/18)
ptyq3:                        character special (5/19)
ptyq4:                        character special (5/20)
ptyq5:                        character special (5/21)
ptyq6:                        character special (5/22)
ptyq7:                        character special (5/23)
ptyq8:                        character special (5/24)
ptyq9:                        character special (5/25)
ptyqa:                        character special (5/26)
ptyqb:                        character special (5/27)
ptyqc:                        character special (5/28)
ptyqd:                        character special (5/29)
ptyqe:                        character special (5/30)
ptyqf:                        character special (5/31)
ptyr0:                        character special (5/32)
ptyr1:                        character special (5/33)
ptyr2:                        character special (5/34)
ptyr3:                        character special (5/35)
ptyr4:                        character special (5/36)
ptyr5:                        character special (5/37)
ptyr6:                        character special (5/38)
ptyr7:                        character special (5/39)
ptyr8:                        character special (5/40)
ptyr9:                        character special (5/41)
ptyra:                        character special (5/42)
ptyrb:                        character special (5/43)
ptyrc:                        character special (5/44)
ptyrd:                        character special (5/45)
ptyre:                        character special (5/46)
ptyrf:                        character special (5/47)
ptys0:                        character special (5/48)
ptys1:                        character special (5/49)
ptys2:                        character special (5/50)
ptys3:                        character special (5/51)
ptys4:                        character special (5/52)
ptys5:                        character special (5/53)
ptys6:                        character special (5/54)
ptys7:                        character special (5/55)
ptys8:                        character special (5/56)
ptys9:                        character special (5/57)
ptysa:                        character special (5/58)
ptysb:                        character special (5/59)
ptysc:                        character special (5/60)
ptysd:                        character special (5/61)
ptyse:                        character special (5/62)
ptysf:                        character special (5/63)
ptyt0:                        character special (5/64)
ptyt1:                        character special (5/65)
ptyt2:                        character special (5/66)
ptyt3:                        character special (5/67)
ptyt4:                        character special (5/68)
ptyt5:                        character special (5/69)
ptyt6:                        character special (5/70)
ptyt7:                        character special (5/71)
ptyt8:                        character special (5/72)
ptyt9:                        character special (5/73)
ptyta:                        character special (5/74)
ptytb:                        character special (5/75)
ptytc:                        character special (5/76)
ptytd:                        character special (5/77)
ptyte:                        character special (5/78)
ptytf:                        character special (5/79)
ptyu0:                        character special (5/80)
ptyu1:                        character special (5/81)
ptyu2:                        character special (5/82)
ptyu3:                        character special (5/83)
ptyu4:                        character special (5/84)
ptyu5:                        character special (5/85)
ptyu6:                        character special (5/86)
ptyu7:                        character special (5/87)
ptyu8:                        character special (5/88)
ptyu9:                        character special (5/89)
ptyua:                        character special (5/90)
ptyub:                        character special (5/91)
ptyuc:                        character special (5/92)
ptyud:                        character special (5/93)
ptyue:                        character special (5/94)
ptyuf:                        character special (5/95)
ptyv0:                        character special (5/96)
ptyv1:                        character special (5/97)
ptyv2:                        character special (5/98)
ptyv3:                        character special (5/99)
ptyv4:                        character special (5/100)
ptyv5:                        character special (5/101)
ptyv6:                        character special (5/102)
ptyv7:                        character special (5/103)
ptyv8:                        character special (5/104)
ptyv9:                        character special (5/105)
ptyva:                        character special (5/106)
ptyvb:                        character special (5/107)
ptyvc:                        character special (5/108)
ptyvd:                        character special (5/109)
ptyve:                        character special (5/110)
ptyvf:                        character special (5/111)
ptyw0:                        character special (5/112)
ptyw1:                        character special (5/113)
ptyw2:                        character special (5/114)
ptyw3:                        character special (5/115)
ptyw4:                        character special (5/116)
ptyw5:                        character special (5/117)
ptyw6:                        character special (5/118)
ptyw7:                        character special (5/119)
ptyw8:                        character special (5/120)
ptyw9:                        character special (5/121)
ptywa:                        character special (5/122)
ptywb:                        character special (5/123)
ptywc:                        character special (5/124)
ptywd:                        character special (5/125)
ptywe:                        character special (5/126)
ptywf:                        character special (5/127)
random:                       character special (14/0)
rdisk0:                       character special (1/0)
rdisk0s1:                     character special (1/1)
rdisk0s2:                     character special (1/2)
rdisk1:                       character special (1/3)
rdisk1s1:                     character special (1/4)
rdisk1s2:                     character special (1/5)
rdisk1s3:                     character special (1/7)
rdisk1s4:                     character special (1/6)
rdisk1s5:                     character special (1/8)
sdt:                          character special (0/0)
stderr:                       character special (16/0)
stdin:                        character special (16/0)
stdout:                       character special (16/0)
systrace:                     character special (0/0)
tty:                          character special (2/0)
tty.AirPods-WirelessiAP:      character special (18/2)
tty.AirPodsMasha-WirelessiAP: character special (18/4)
tty.Bluetooth-Incoming-Port:  character special (18/0)
ttyp0:                        character special (4/0)
ttyp1:                        character special (4/1)
ttyp2:                        character special (4/2)
ttyp3:                        character special (4/3)
ttyp4:                        character special (4/4)
ttyp5:                        character special (4/5)
ttyp6:                        character special (4/6)
ttyp7:                        character special (4/7)
ttyp8:                        character special (4/8)
ttyp9:                        character special (4/9)
ttypa:                        character special (4/10)
ttypb:                        character special (4/11)
ttypc:                        character special (4/12)
ttypd:                        character special (4/13)
ttype:                        character special (4/14)
ttypf:                        character special (4/15)
ttyq0:                        character special (4/16)
ttyq1:                        character special (4/17)
ttyq2:                        character special (4/18)
ttyq3:                        character special (4/19)
ttyq4:                        character special (4/20)
ttyq5:                        character special (4/21)
ttyq6:                        character special (4/22)
ttyq7:                        character special (4/23)
ttyq8:                        character special (4/24)
ttyq9:                        character special (4/25)
ttyqa:                        character special (4/26)
ttyqb:                        character special (4/27)
ttyqc:                        character special (4/28)
ttyqd:                        character special (4/29)
ttyqe:                        character special (4/30)
ttyqf:                        character special (4/31)
ttyr0:                        character special (4/32)
ttyr1:                        character special (4/33)
ttyr2:                        character special (4/34)
ttyr3:                        character special (4/35)
ttyr4:                        character special (4/36)
ttyr5:                        character special (4/37)
ttyr6:                        character special (4/38)
ttyr7:                        character special (4/39)
ttyr8:                        character special (4/40)
ttyr9:                        character special (4/41)
ttyra:                        character special (4/42)
ttyrb:                        character special (4/43)
ttyrc:                        character special (4/44)
ttyrd:                        character special (4/45)
ttyre:                        character special (4/46)
ttyrf:                        character special (4/47)
ttys0:                        character special (4/48)
ttys000:                      character special (16/0)
ttys1:                        character special (4/49)
ttys2:                        character special (4/50)
ttys3:                        character special (4/51)
ttys4:                        character special (4/52)
ttys5:                        character special (4/53)
ttys6:                        character special (4/54)
ttys7:                        character special (4/55)
ttys8:                        character special (4/56)
ttys9:                        character special (4/57)
ttysa:                        character special (4/58)
ttysb:                        character special (4/59)
ttysc:                        character special (4/60)
ttysd:                        character special (4/61)
ttyse:                        character special (4/62)
ttysf:                        character special (4/63)
ttyt0:                        character special (4/64)
ttyt1:                        character special (4/65)
ttyt2:                        character special (4/66)
ttyt3:                        character special (4/67)
ttyt4:                        character special (4/68)
ttyt5:                        character special (4/69)
ttyt6:                        character special (4/70)
ttyt7:                        character special (4/71)
ttyt8:                        character special (4/72)
ttyt9:                        character special (4/73)
ttyta:                        character special (4/74)
ttytb:                        character special (4/75)
ttytc:                        character special (4/76)
ttytd:                        character special (4/77)
ttyte:                        character special (4/78)
ttytf:                        character special (4/79)
ttyu0:                        character special (4/80)
ttyu1:                        character special (4/81)
ttyu2:                        character special (4/82)
ttyu3:                        character special (4/83)
ttyu4:                        character special (4/84)
ttyu5:                        character special (4/85)
ttyu6:                        character special (4/86)
ttyu7:                        character special (4/87)
ttyu8:                        character special (4/88)
ttyu9:                        character special (4/89)
ttyua:                        character special (4/90)
ttyub:                        character special (4/91)
ttyuc:                        character special (4/92)
ttyud:                        character special (4/93)
ttyue:                        character special (4/94)
ttyuf:                        character special (4/95)
ttyv0:                        character special (4/96)
ttyv1:                        character special (4/97)
ttyv2:                        character special (4/98)
ttyv3:                        character special (4/99)
ttyv4:                        character special (4/100)
ttyv5:                        character special (4/101)
ttyv6:                        character special (4/102)
ttyv7:                        character special (4/103)
ttyv8:                        character special (4/104)
ttyv9:                        character special (4/105)
ttyva:                        character special (4/106)
ttyvb:                        character special (4/107)
ttyvc:                        character special (4/108)
ttyvd:                        character special (4/109)
ttyve:                        character special (4/110)
ttyvf:                        character special (4/111)
ttyw0:                        character special (4/112)
ttyw1:                        character special (4/113)
ttyw2:                        character special (4/114)
ttyw3:                        character special (4/115)
ttyw4:                        character special (4/116)
ttyw5:                        character special (4/117)
ttyw6:                        character special (4/118)
ttyw7:                        character special (4/119)
ttyw8:                        character special (4/120)
ttyw9:                        character special (4/121)
ttywa:                        character special (4/122)
ttywb:                        character special (4/123)
ttywc:                        character special (4/124)
ttywd:                        character special (4/125)
ttywe:                        character special (4/126)
ttywf:                        character special (4/127)
urandom:                      character special (14/1)
xcpm:                         character special (21/0)
zero:                         character special (3/3)

c) MacBook-Pro-Mark:dev mraker$ cd /sbin 
MacBook-Pro-Mark:sbin mraker$ file ifconfig
ifconfig: Mach-O 64-bit executable x86_64

MacBook-Pro-Mark:sbin mraker$ cd /etc
MacBook-Pro-Mark:etc mraker$ file hosts
hosts: ASCII text

d) MacBook-Pro-Mark:dev mraker$ file sda1
sda1: cannot open `sda1' (No such file or directory)

e) MacBook-Pro-Mark:dev mraker$ cd /proc
-bash: cd: /proc: No such file or directory

f) MacBook-Pro-Mark:~ mraker$ stat /etc/init.d/
stat: /etc/init.d/: stat: No such file or directory
