exports.devconfig={ //开发自己构建
    'srcFolders':'module,teacher,president',//须要处理的目录
    'publicPrefix':'E:/project/EPD_Testlibrary/Trunk/Development/Source/zhixue/teacher/webapp/src/main/webapp/WEB-INF/views',//发布目录
    'staticFolder':'E:/project/EPD_Testlibrary/Trunk/Development/Source/zhixue/teacher/webapp/src/main/webapp/public', //静态文件存放目录
    'staticUrlPrefix':'/teacher/public/',//静态文件网址前缀
    'srcCompression': 'marking',            //js 文件压缩目录
    'compression': false           //js 文件是否压缩
};
exports.dailyconfig={ // 每日构建
    'srcFolders':'module,teacher,president',//须要处理的目录
    'publicPrefix':'/home/jenkins_home/workspace/edu-elp-daily-ZX-teacher/teacher/webapp/src/main/webapp/WEB-INF/views',//发布目录
    'staticFolder':'/home/jenkins_home/workspace/edu-elp-daily-ZX-teacher/teacher/webapp/src/main/webapp/public', //静态文件存放目录
    'staticUrlPrefix':'/teacher/public/',//静态文件网址前缀
    'srcCompression': 'marking',            //js 文件压缩目录
    'compression': false            //js 文件是否压缩
};
exports.devhandconfig={ // 每日构建
    'srcFolders':'module,teacher,president',//须要处理的目录
    'publicPrefix':'/home/jenkins_home/workspace/edu-elp-devhand-ZX-teacher/teacher/webapp/src/main/webapp/WEB-INF/views',//发布目录
    'staticFolder':'/home/jenkins_home/workspace/edu-elp-devhand-ZX-teacher/teacher/webapp/src/main/webapp/public', //静态文件存放目录
    'staticUrlPrefix':'/teacher/public/',//静态文件网址前缀
    'srcCompression': 'marking',            //js 文件压缩目录
    'compression': false            //js 文件是否压缩
};
exports.testconfig={ //测试构建版本
    'srcFolders':'module,teacher,president',//须要处理的目录
    'publicPrefix':'/home/jenkins_home/workspace/edu-elp-test-ZX-teacher-deploy/teacher/webapp/src/main/webapp/WEB-INF/views',//发布目录
    'staticFolder':'/home/jenkins_home/workspace/edu-elp-test-ZX-teacher-deploy/teacher/webapp/src/main/webapp/public', //静态文件存放目录
    'staticUrlPrefix':'/teacher/public/',//静态文件网址前缀
    'srcCompression': 'marking',            //js 文件压缩目录
    'compression': false            //js 文件是否压缩
};
exports.testconfig2={ //持续构建平台构建版本
    'srcFolders':'module,teacher,president',//须要处理的目录
    'publicPrefix':'/disk1/jenkins/workspace/ZhiXueWang-ShiShengJiaTEST.Teacher-teacher.test/teacher/webapp/src/main/webapp/WEB-INF/views',//发布目录
    'staticFolder':'/disk1/jenkins/workspace/ZhiXueWang-ShiShengJiaTEST.Teacher-teacher.test/teacher/webapp/src/main/webapp/public', //静态文件存放目录
    'staticUrlPrefix':'/teacher/public/',//静态文件网址前缀
    'srcCompression': 'marking',            //js 文件压缩目录
    'compression': false            //js 文件是否压缩
};
exports.productpreconfig={ //预上线构建
    'srcFolders':'module,teacher,president',//须要处理的目录
    'publicPrefix':'/home/jenkins_home/workspace/edu-elp-productpre-ZX-teacher-deploy/teacher/webapp/src/main/webapp/WEB-INF/views',//发布目录
    'staticFolder':'/home/jenkins_home/workspace/edu-elp-productpre-ZX-teacher-deploy/teacher/webapp/src/main/webapp/public', //静态文件存放目录
    'staticUrlPrefix':'/teacher/public/',//静态文件网址前缀
    'srcCompression': 'marking',            //js 文件压缩目录
    'compression': false            //js 文件是否压缩
};
exports.productyanshiconfig={ //预上线构建
    'srcFolders':'module,teacher,president',//须要处理的目录
    'publicPrefix':'/home/jenkins_home/workspace/edu-elp-productyanshi-teacher/teacher/webapp/src/main/webapp/WEB-INF/views',//发布目录
    'staticFolder':'/home/jenkins_home/workspace/edu-elp-productyanshi-teacher/teacher/webapp/src/main/webapp/public', //静态文件存放目录
    'staticUrlPrefix':'/public/',//静态文件网址前缀
    'srcCompression': 'marking',            //js 文件压缩目录
    'compression': false            //js 文件是否压缩
};
exports.productconfig={ //金盘上线构建
    'srcFolders':'module,teacher,president',//须要处理的目录
    'publicPrefix':'/home/jenkins_home/workspace/edu-elp-product-ZX-teacher-deploy/teacher/webapp/src/main/webapp/WEB-INF/views',//发布目录
    'staticFolder':'/home/jenkins_home/workspace/edu-elp-product-ZX-teacher-deploy/teacher/webapp/src/main/webapp/public', //静态文件存放目录
    'staticUrlPrefix':'/teacher/public/',//静态文件网址前缀
    'srcCompression': 'marking',            //js 文件压缩目录
    'compression': false            //js 文件是否压缩
};
exports.linuxconfig={ //金盘上线构建
    'srcFolders':'module,teacher,president',//须要处理的目录
    'publicPrefix':'/home/jenkins_home/workspace/edu-elp-devhand-teacher-linux/server/webapp/src/main/webapp/WEB-INF/views',//发布目录
    'staticFolder':'/home/jenkins_home/workspace/edu-elp-devhand-teacher-linux/server/webapp/src/main/webapp/public', //静态文件存放目录
    'staticUrlPrefix':'/teacher/public/',//静态文件网址前缀
    'srcCompression': 'marking',            //js 文件压缩目录
    'compression': false            //js 文件是否压缩
};
exports.dailylinuxconfig={ //linux每日构建
    'srcFolders':'module,teacher,president',//须要处理的目录
    'publicPrefix':'/home/jenkins_home/workspace/edu-elp-daily-tlsysapp-linux/server/webapp/src/main/webapp/WEB-INF/views',//发布目录
    'staticFolder':'/home/jenkins_home/workspace/edu-elp-daily-tlsysapp-linux/server/webapp/src/main/webapp/public', //静态文件存放目录
    'staticUrlPrefix':'/teacher/public/',//静态文件网址前缀
    'srcCompression': 'marking',            //js 文件压缩目录
    'compression': false            //js 文件是否压缩
};
exports.testlinuxconfig={ //linux测试构建
    'srcFolders':'module,teacher,president',//须要处理的目录
    'publicPrefix':'/home/jenkins_home/workspace/edu-elp-test-tlsysapp-linux/server/webapp/src/main/webapp/WEB-INF/views',//发布目录
    'staticFolder':'/home/jenkins_home/workspace/edu-elp-test-tlsysapp-linux/server/webapp/src/main/webapp/public', //静态文件存放目录
    'staticUrlPrefix':'/teacher/public/',//静态文件网址前缀
    'srcCompression': 'marking',            //js 文件压缩目录
    'compression': false            //js 文件是否压缩
};
