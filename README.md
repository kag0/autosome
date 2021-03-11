<script type='module' src="https://kag0.github.io/sauce/sauce.js">
<h1>If you're reading this, click <a href="github.io/kag0/autosome" HERE</a></h1>
</script>

> magnet for more ergonomic optional parameters

## Callers don't need to wrap parameters in `Some`

<sauce-code
  repo='kag0/autosome'
  file='autosome/test/src/io/github/kag0/autosome/test/Examples.scala'
  lines='7:10'
></sauce-code>

## `AutoSome` values can be passed as `Option`s

<sauce-code
repo='kag0/autosome'
file='autosome/test/src/io/github/kag0/autosome/test/Examples.scala'
lines='14:17'
></sauce-code>

## Pattern match without nested `Some`/`None`

<sauce-code
repo='kag0/autosome'
file='autosome/test/src/io/github/kag0/autosome/test/Examples.scala'
lines='21:25'
></sauce-code>

## Invoke methods on `AutoSome` as if it were `Option`

<sauce-code
repo='kag0/autosome'
file='autosome/test/src/io/github/kag0/autosome/test/Examples.scala'
lines='27:28'
></sauce-code>

## Concise default parameters

<sauce-code
repo='kag0/autosome'
file='autosome/test/src/io/github/kag0/autosome/test/Examples.scala'
lines='30:30'
></sauce-code>