package requests;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GET_Request {
    public static void main(String[] args) {
        RestAssured.baseURI="http://bookstore.toolsqa.com";
        RequestSpecification httpRequest=RestAssured.given();
        Response response=httpRequest.request(Method.GET,"/Bookstore/v1/Books");

        int statusCode= response.getStatusCode();
        System.out.println("Response status code is "+statusCode);

        System.out.println("                       ");

        Headers header =response.getHeaders();
        System.out.println("Headers for Response are " +header);

        System.out.println("                       ");

        ResponseBody body=response.getBody();
        body.prettyPeek();
        System.out.println("Response Body is "+body.asString());
    }
}

//    Response status code is 200
//
//        Headers for Response are Server=nginx/1.17.10 (Ubuntu)
//        Date=Sat, 14 Jan 2023 06:50:42 GMT
//        Content-Type=application/json; charset=utf-8
//        Content-Length=4514
//        Connection=keep-alive
//        X-Powered-By=Express
//        ETag=W/"11a2-8zfX++QwcgaCjSU6F8JP9fUd1tY"
//
//        HTTP/1.1 200 OK
//        Server: nginx/1.17.10 (Ubuntu)
//        Date: Sat, 14 Jan 2023 06:50:42 GMT
//        Content-Type: application/json; charset=utf-8
//        Content-Length: 4514
//        Connection: keep-alive
//        X-Powered-By: Express
//        ETag: W/"11a2-8zfX++QwcgaCjSU6F8JP9fUd1tY"
//
//        {
//        "books": [
//        {
//        "isbn": "9781449325862",
//        "title": "Git Pocket Guide",
//        "subTitle": "A Working Introduction",
//        "author": "Richard E. Silverman",
//        "publish_date": "2020-06-04T08:48:39.000Z",
//        "publisher": "O'Reilly Media",
//        "pages": 234,
//        "description": "This pocket guide is the perfect on-the-job companion to Git, the distributed version control system. It provides a compact, readable introduction to Git for new users, as well as a reference to common commands and procedures for those of you with Git exp",
//        "website": "http://chimera.labs.oreilly.com/books/1230000000561/index.html"
//        },
//        {
//        "isbn": "9781449331818",
//        "title": "Learning JavaScript Design Patterns",
//        "subTitle": "A JavaScript and jQuery Developer's Guide",
//        "author": "Addy Osmani",
//        "publish_date": "2020-06-04T09:11:40.000Z",
//        "publisher": "O'Reilly Media",
//        "pages": 254,
//        "description": "With Learning JavaScript Design Patterns, you'll learn how to write beautiful, structured, and maintainable JavaScript by applying classical and modern design patterns to the language. If you want to keep your code efficient, more manageable, and up-to-da",
//        "website": "http://www.addyosmani.com/resources/essentialjsdesignpatterns/book/"
//        },
//        {
//        "isbn": "9781449337711",
//        "title": "Designing Evolvable Web APIs with ASP.NET",
//        "subTitle": "Harnessing the Power of the Web",
//        "author": "Glenn Block et al.",
//        "publish_date": "2020-06-04T09:12:43.000Z",
//        "publisher": "O'Reilly Media",
//        "pages": 238,
//        "description": "Design and build Web APIs for a broad range of clients—including browsers and mobile devices—that can adapt to change over time. This practical, hands-on guide takes you through the theory and tools you need to build evolvable HTTP services with Microsoft",
//        "website": "http://chimera.labs.oreilly.com/books/1234000001708/index.html"
//        },
//        {
//        "isbn": "9781449365035",
//        "title": "Speaking JavaScript",
//        "subTitle": "An In-Depth Guide for Programmers",
//        "author": "Axel Rauschmayer",
//        "publish_date": "2014-02-01T00:00:00.000Z",
//        "publisher": "O'Reilly Media",
//        "pages": 460,
//        "description": "Like it or not, JavaScript is everywhere these days-from browser to server to mobile-and now you, too, need to learn the language or dive deeper than you have. This concise book guides you into and through JavaScript, written by a veteran programmer who o",
//        "website": "http://speakingjs.com/"
//        },
//        {
//        "isbn": "9781491904244",
//        "title": "You Don't Know JS",
//        "subTitle": "ES6 & Beyond",
//        "author": "Kyle Simpson",
//        "publish_date": "2015-12-27T00:00:00.000Z",
//        "publisher": "O'Reilly Media",
//        "pages": 278,
//        "description": "No matter how much experience you have with JavaScript, odds are you don’t fully understand the language. As part of the \\\"You Don’t Know JS\\\" series, this compact guide focuses on new features available in ECMAScript 6 (ES6), the latest version of the st",
//        "website": "https://github.com/getify/You-Dont-Know-JS/tree/master/es6%20&%20beyond"
//        },
//        {
//        "isbn": "9781491950296",
//        "title": "Programming JavaScript Applications",
//        "subTitle": "Robust Web Architecture with Node, HTML5, and Modern JS Libraries",
//        "author": "Eric Elliott",
//        "publish_date": "2014-07-01T00:00:00.000Z",
//        "publisher": "O'Reilly Media",
//        "pages": 254,
//        "description": "Take advantage of JavaScript's power to build robust web-scale or enterprise applications that are easy to extend and maintain. By applying the design patterns outlined in this practical book, experienced JavaScript developers will learn how to write flex",
//        "website": "http://chimera.labs.oreilly.com/books/1234000000262/index.html"
//        },
//        {
//        "isbn": "9781593275846",
//        "title": "Eloquent JavaScript, Second Edition",
//        "subTitle": "A Modern Introduction to Programming",
//        "author": "Marijn Haverbeke",
//        "publish_date": "2014-12-14T00:00:00.000Z",
//        "publisher": "No Starch Press",
//        "pages": 472,
//        "description": "JavaScript lies at the heart of almost every modern web application, from social apps to the newest browser-based games. Though simple for beginners to pick up and play with, JavaScript is a flexible, complex language that you can use to build full-scale ",
//        "website": "http://eloquentjavascript.net/"
//        },
//        {
//        "isbn": "9781593277574",
//        "title": "Understanding ECMAScript 6",
//        "subTitle": "The Definitive Guide for JavaScript Developers",
//        "author": "Nicholas C. Zakas",
//        "publish_date": "2016-09-03T00:00:00.000Z",
//        "publisher": "No Starch Press",
//        "pages": 352,
//        "description": "ECMAScript 6 represents the biggest update to the core of JavaScript in the history of the language. In Understanding ECMAScript 6, expert developer Nicholas C. Zakas provides a complete guide to the object types, syntax, and other exciting changes that E",
//        "website": "https://leanpub.com/understandinges6/read"
//        }
//        ]
//        }
//        Response Body is {"books":[{"isbn":"9781449325862","title":"Git Pocket Guide","subTitle":"A Working Introduction","author":"Richard E. Silverman","publish_date":"2020-06-04T08:48:39.000Z","publisher":"O'Reilly Media","pages":234,"description":"This pocket guide is the perfect on-the-job companion to Git, the distributed version control system. It provides a compact, readable introduction to Git for new users, as well as a reference to common commands and procedures for those of you with Git exp","website":"http://chimera.labs.oreilly.com/books/1230000000561/index.html"},{"isbn":"9781449331818","title":"Learning JavaScript Design Patterns","subTitle":"A JavaScript and jQuery Developer's Guide","author":"Addy Osmani","publish_date":"2020-06-04T09:11:40.000Z","publisher":"O'Reilly Media","pages":254,"description":"With Learning JavaScript Design Patterns, you'll learn how to write beautiful, structured, and maintainable JavaScript by applying classical and modern design patterns to the language. If you want to keep your code efficient, more manageable, and up-to-da","website":"http://www.addyosmani.com/resources/essentialjsdesignpatterns/book/"},{"isbn":"9781449337711","title":"Designing Evolvable Web APIs with ASP.NET","subTitle":"Harnessing the Power of the Web","author":"Glenn Block et al.","publish_date":"2020-06-04T09:12:43.000Z","publisher":"O'Reilly Media","pages":238,"description":"Design and build Web APIs for a broad range of clients—including browsers and mobile devices—that can adapt to change over time. This practical, hands-on guide takes you through the theory and tools you need to build evolvable HTTP services with Microsoft","website":"http://chimera.labs.oreilly.com/books/1234000001708/index.html"},{"isbn":"9781449365035","title":"Speaking JavaScript","subTitle":"An In-Depth Guide for Programmers","author":"Axel Rauschmayer","publish_date":"2014-02-01T00:00:00.000Z","publisher":"O'Reilly Media","pages":460,"description":"Like it or not, JavaScript is everywhere these days-from browser to server to mobile-and now you, too, need to learn the language or dive deeper than you have. This concise book guides you into and through JavaScript, written by a veteran programmer who o","website":"http://speakingjs.com/"},{"isbn":"9781491904244","title":"You Don't Know JS","subTitle":"ES6 & Beyond","author":"Kyle Simpson","publish_date":"2015-12-27T00:00:00.000Z","publisher":"O'Reilly Media","pages":278,"description":"No matter how much experience you have with JavaScript, odds are you don’t fully understand the language. As part of the \\\"You Don’t Know JS\\\" series, this compact guide focuses on new features available in ECMAScript 6 (ES6), the latest version of the st","website":"https://github.com/getify/You-Dont-Know-JS/tree/master/es6%20&%20beyond"},{"isbn":"9781491950296","title":"Programming JavaScript Applications","subTitle":"Robust Web Architecture with Node, HTML5, and Modern JS Libraries","author":"Eric Elliott","publish_date":"2014-07-01T00:00:00.000Z","publisher":"O'Reilly Media","pages":254,"description":"Take advantage of JavaScript's power to build robust web-scale or enterprise applications that are easy to extend and maintain. By applying the design patterns outlined in this practical book, experienced JavaScript developers will learn how to write flex","website":"http://chimera.labs.oreilly.com/books/1234000000262/index.html"},{"isbn":"9781593275846","title":"Eloquent JavaScript, Second Edition","subTitle":"A Modern Introduction to Programming","author":"Marijn Haverbeke","publish_date":"2014-12-14T00:00:00.000Z","publisher":"No Starch Press","pages":472,"description":"JavaScript lies at the heart of almost every modern web application, from social apps to the newest browser-based games. Though simple for beginners to pick up and play with, JavaScript is a flexible, complex language that you can use to build full-scale ","website":"http://eloquentjavascript.net/"},{"isbn":"9781593277574","title":"Understanding ECMAScript 6","subTitle":"The Definitive Guide for JavaScript Developers","author":"Nicholas C. Zakas","publish_date":"2016-09-03T00:00:00.000Z","publisher":"No Starch Press","pages":352,"description":"ECMAScript 6 represents the biggest update to the core of JavaScript in the history of the language. In Understanding ECMAScript 6, expert developer Nicholas C. Zakas provides a complete guide to the object types, syntax, and other exciting changes that E","website":"https://leanpub.com/understandinges6/read"}]}



